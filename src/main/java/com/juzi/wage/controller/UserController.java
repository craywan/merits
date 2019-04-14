package com.juzi.wage.controller;

import com.juzi.wage.config.MySystemConfig;
import com.juzi.wage.model.dto.ResponseDto;
import com.juzi.wage.model.dto.UserInfoDto;
import com.juzi.wage.service.UserService;
import com.juzi.wage.util.DownloadExcel;
import com.juzi.wage.util.ResultUtil;
import javafx.scene.chart.ChartBuilder;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.controller
 * @ClassName: UserController
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/10 23:20
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private MySystemConfig systemConfig;
    /**
     * 教师登录
     */
    @PostMapping("/login")
    public void login( HttpServletRequest request,HttpServletResponse response,@RequestParam("username") String userName, @RequestParam("password")String password){


        //检查合法性
        if(userName==""||password==""){
            try {
                response.sendRedirect("../lxxc/login_eroor.html");
                return ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        boolean flag=false;
        flag=userService.isNotOpen();
        if(flag==false){
            //系统关闭状态
            try {
                response.sendRedirect("../lxxc/close.html");
                return ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //检查账号密码正确性
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserId(userName);
        userInfoDto.setPwd(password);
        int userStatus =userService.checkLogin(userInfoDto);
        if(userStatus==0){
            try {
                response.sendRedirect("../lxxc/login_eroor.html");
                return ;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        request.getSession().setAttribute("username",userName);

            Cookie cookie = new Cookie("username",userName);
            cookie.setMaxAge(60*60*24);
            cookie.setPath("/");
            response.addCookie(cookie);
           //判断是用户还是管理员
            if(userStatus==1){
                try {
                    response.sendRedirect("../lxxc/regist.html");
                    return ;
                } catch (IOException e) {
                    e.printStackTrace();
                }
           }else{
                try {
                    response.sendRedirect("/lxxc/admin.html");
                    return ;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }

    /**
     * 下载Excel文件
     * @param request
     * @param response
     */
    @RequestMapping(value = "/downloadApp", method = RequestMethod.GET)
    public void downloadApp(HttpServletRequest request, HttpServletResponse response) {
        //根据session获取教师工号
        Cookie[] cookies = request.getCookies();
        String userId= "110";
        userId= (String) request.getSession().getAttribute("username");
        if(cookies!=null){

            for (Cookie c :cookies) {
                if("username".equals(c.getName())){
                    userId=c.getValue();
                    System.out.println(c.getName()+":"+c.getValue());
                }
            }
        }else{
            try {
                response.sendRedirect("../lxxc/regist.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //文件下载
        String appUrl = systemConfig.getApplicationHomePath()+"/teacher/" + userId + ".xls";

        DownloadExcel.downloadExcel(request,response,userId,appUrl);

//        System.out.println(appUrl);
//        //NIO成实现文件下载的操作
//        File appFile = new File(appUrl);
//        response.setContentType("application/ vnd.ms-excel");
//        //设置文件名字.很重要
//        response.setHeader("Content-Disposition","attachment;filename="+userId+".xls");
//        FileInputStream input = null;
//        try {
//            input = new FileInputStream(appFile);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        OutputStream output = null;
//        try {
//            output = response.getOutputStream();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        FileChannel fint = input.getChannel();
//        ByteBuffer buffer = ByteBuffer.allocate(10 * 1024);
//        //数据读取
//        byte[] toArr = new byte[10 * 1024];
//        try {
//            while (true) {
//
//                int flag = fint.read(buffer);
//                if (flag == -1) {
//                    break;
//                }
//                buffer.flip();
//                while (buffer.hasRemaining()) {
//                    //输出
//                    int mget = Math.min(buffer.remaining(), 10 * 1024);
//                    buffer.get(toArr, 0, mget);
//                    output.write(toArr);
//                }
//
//                buffer.clear();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fint.close();
//                output.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

    }
}
