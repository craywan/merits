package com.juzi.wage.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.juzi.wage.component.ModelExcelListener;
import com.juzi.wage.config.MySystemConfig;
import com.juzi.wage.config.ServiceContext;
import com.juzi.wage.model.dto.ResponseDto;
import com.juzi.wage.model.dto.UserDto;
import com.juzi.wage.model.entity.*;
import com.juzi.wage.model.vo.TreeVo;
import com.juzi.wage.model.vo.UserExcelModel;
import com.juzi.wage.service.*;
import com.juzi.wage.util.*;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.controller
 * @ClassName: UserController
 * @Author: wanzh
 * @Description: 用户账号管理控制类
 * @Date: 2019/4/10 23:20
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends AbstractController {
    @Resource
    private UserService userService;
    @Resource
    private MySystemConfig systemConfig;

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private FileMnageService fileMnageService;

    @Autowired
    private ExcelService excelService;
    @Autowired
    private ExcelDemoService excelDemoService;

    @Autowired
    private MySystemConfig mySystemConfig;

    @RequestMapping("/list")
    public String toList(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "admin/list";
    }

    /**
     * 跳转到对应角色的主页
     *
     * @return
     */
    @RequestMapping("/toIndex")
//    @RequiresRoles(value={"ADMIN","SUPER_ADMIN","USER"},logical = Logical.OR)
    public String toIndex(String role ,HttpServletRequest request, Model model,HttpServletResponse response) {


        if("USER".equals(role)){
            return "redirect: front/meritsindex";
        }else if("ADMIN".equals(role)){
            return "redirect: index";
        }
        return null;
    }

    /**
     * 跳转到账号信息管理界面
     * @param request
     * @return
     */
    @RequestMapping(value = "/admin/toQuery")
    public String toQuery(HttpServletRequest request){
        return "admin/list";
    }

    /**
     * 获取所有用户账号信息
     *
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/admin/query")
//    @RequiresRoles(value={"ADMIN","SUPER_ADMIN"},logical = Logical.OR)
    public ModelAndView query(HttpServletRequest request) {
        //获取账号信息
        List<Map<String, Object>> userInfoList = userService.queryAll();
        List<UserDto> userInfoDtos = Lists.newArrayList();
        for (Map<String, Object> map : userInfoList) {
            UserDto userDto = new UserDto();
            userDto.setName((String) map.get("name"));
            userDto.setUsername((String) map.get("username"));
            userDto.setMail((String) map.get("mail"));
            userDto.setUid((Long) map.get("uid"));
            userDto.setState((Integer) map.get("state"));
            userDto.setDescription((String) map.get("description"));
            userInfoDtos.add(userDto);
        }
        ModelAndView modelAndView = new ModelAndView("admin/list");
        //获取角色
        modelAndView.addObject("users", userInfoDtos);
//        return new ModelAndView("admin/list","users",model);

        return modelAndView;

    }

    @RequestMapping("/admin/toEdit")
    public String toEdit(Model model, String username, HttpServletRequest request) {
        Map<String, Object> map = userService.queryByUsername(username);
        UserDto userDto = new UserDto();
        if (map != null) {
            userDto.setUid((Long) map.get("uid"));
            userDto.setUsername((String) map.get("username"));
            userDto.setName((String) map.get("name"));
            userDto.setMail((String) map.get("mail"));
            userDto.setDescription((String) map.get("description"));
            userDto.setState((Integer) map.get("state"));
        }
        model.addAttribute("user", userDto);
        model.addAttribute("roles", userService.selectRoles());
        return "admin/update";
    }

    @RequestMapping(value = "/admin/save",produces = { "application/json;charset=UTF-8"})
    @ResponseBody
    @RequiresRoles(value={"SUPER_ADMIN"},logical = Logical.OR)
    public String save(UserDto userDto, HttpServletRequest request) {
        if (userDto.getState() == null || userDto.getRoleId() == null) {
            return createErrorResponse("L1001", "参数缺失", request);
        }
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userDto, userInfo);
        userInfoService.updateUserInfo(userInfo);
        //获取角色信息
        SysRole sysRole = userService.getRoleByRoleId(userDto.getRoleId());
        //更新用户和角色关系表
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setUserName(userDto.getUsername());
        sysUserRole.setRoleId(sysRole.getRoleId());
        userService.updateUserRole(sysUserRole);
        return createSuccessResponse("OK", request);
    }

    @RequestMapping("/admin/toManage")
    public String toManage(HttpServletRequest request, Model model) {
        return "/admin/manage";
    }

    /**
     * 批量导入用户
     * @param excelFile
     * @param request
     * @return
     */
    @RequestMapping("/admin/addBatchUsers")
    @ResponseBody
    @RequiresRoles(value={"SUPER_ADMIN"},logical = Logical.OR)
    public String addBacthUsers(MultipartFile excelFile, HttpServletRequest request) {
        List<UserExcelModel> dataList = Lists.newArrayList();
        Sheet sheet = new Sheet(1, 1, UserExcelModel.class);
        ModelExcelListener<UserExcelModel> listener = new ModelExcelListener<UserExcelModel>();
        try {
            ExcelReader excelReader = new ExcelReader(new BufferedInputStream(excelFile.getInputStream()), ExcelTypeEnum.XLS, null, listener);
            excelReader.read(sheet);
            dataList = listener.getDataList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (dataList.size() <= 0) {
            return createErrorResponse("L1001", "excel无数据", request);
        }
        //处理数据
        List<UserInfo> userInfoList = Lists.newArrayList();
        dataList.stream().forEach(
                e -> {
                    UserInfo userInfo = new UserInfo();
                    userInfo.setUsername(e.getUsername());
                    userInfo.setPassword(e.getPassword());
                    userInfo.setMail(e.getMail());
                    userInfo.setName(e.getName());
                    userInfo.setState(1);
                    String curTime = DateHelper.getDateString(Calendar.getInstance().getTime(), DateHelper.sdf);
                    userInfo.setCreateTime(curTime);
                    userInfo.setUpdateTime(curTime);
                    userInfoList.add(userInfo);
                }
        );
        //导入处理
        userInfoService.insertBacth(userInfoList);
        return createSuccessResponse("OK", request);
    }



    /**
     * 下载Excel文件
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/downloadApp", method = RequestMethod.GET)
    @RequiresRoles(value={"SUPER_ADMIN"},logical = Logical.OR)
    public void downloadApp(HttpServletRequest request, HttpServletResponse response) {
        //根据session获取教师工号
        Cookie[] cookies = request.getCookies();
        String userId = "110";
        userId = (String) request.getSession().getAttribute("username");
        if (cookies != null) {

            for (Cookie c : cookies) {
                if ("username".equals(c.getName())) {
                    userId = c.getValue();
                    System.out.println(c.getName() + ":" + c.getValue());
                }
            }
        } else {
            try {
                response.sendRedirect("../lxxc/regist.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //文件下载
        String appUrl = systemConfig.getApplicationHomePath() + "/teacher/" + userId + ".xls";

        DownloadExcel.downloadExcel(request, response, userId, appUrl);


    }

    /**
     * 教师查询绩效信息
     *
     * @return
     */
    @RequestMapping(value = "/querymerits",produces = { "application/json;charset=UTF-8"})
    @ResponseBody
    @RequiresRoles(value={"USER"},logical = Logical.OR)
    public String queryMeritsInfo(@RequestParam String username, HttpServletRequest request, Model model) {
        //查询教师绩效信息对应的表头
        Map<String, Object> resultMap = Maps.newHashMap();
        FileInfomation fileInfomation = excelService.getCurTeaExcelInfo(username);
        if (fileInfomation == null) {
            resultMap.put("msg", "暂无绩效信息");
            resultMap.put("code", "L1001");
            return createErrorResponse("L1001","暂无绩效信息",request);
        }
        //获取模板id
        Integer demoId = fileInfomation.getDemoid();
        //获取模板信息
        ExcelDemoInfo excelDemoInfo = excelDemoService.getExcelDemoById(demoId);

        //树形话
        List<List<String>> headerLists = Lists.newArrayList();
        List<String> headerList = JSONObject.parseArray(excelDemoInfo.getHeaderinfo(), String.class);
        headerList.stream().forEach(
                e -> {
                    headerLists.add(StringUtil.strTolist(e));
                }
        );
        //获取文件数据
        File curFile = new File(mySystemConfig.getSystemPath() + ServiceContext.TEA_EXCEL_URL + fileInfomation.getFileurl());
        Sheet sheet = new Sheet(1, excelDemoInfo.getHeadernum());
        List<Object> excelList = null;
        try {
            excelList = EasyExcelFactory.read(new BufferedInputStream(new FileInputStream(curFile)), sheet);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> dataList = (List<String>) excelList.get(0);
        //补全datalist大小
        int m = dataList.size();
        for (int i = 0; i < headerList.size() - m; i++) {
            dataList.add("");
        }
        //树形化
        List<TreeVo> treeVos = TreeTransferUtil.treeTransfer(dataList, headerLists, excelDemoInfo.getHeadernum());
        resultMap.put("code", 0);
        resultMap.put("msg", "OK");
        resultMap.put("data", treeVos);
        resultMap.put("is", true);
        resultMap.put("tip", "操作成功！");
        resultMap.put("count", treeVos.size());
        return createJsonResponse("200",resultMap,null,request);


    }

    /**
     * 删除选中的user是
     * @param dusername
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/admin/deleteUser",method = {RequestMethod.GET})
    @ResponseBody
    @RequiresRoles(value={"SUPER_ADMIN"},logical = Logical.OR)
    public String deleteUser(@RequestParam("dusername") String dusername,HttpServletRequest request,Model model){
        userInfoService.deleteUser(dusername);
        return createSuccessResponse("OK",request);
    }

    @RequestMapping("/confirmMerits")
    @ResponseBody
    @RequiresRoles(value={"USER"},logical = Logical.OR)
    public String confirmMerits(@RequestParam("username")String username,HttpServletRequest request, HttpServletResponse response, Model model){
        //获取该教师当前的绩效信息
        FileInfomation curFileInfomation = excelService.getCurTeaExcelInfo(username);
        curFileInfomation.setFilestate(ServiceContext.CONFIRM_STATE);
        excelService.updateMerits(curFileInfomation);
        return createSuccessResponse("OK",request);
    }




}
