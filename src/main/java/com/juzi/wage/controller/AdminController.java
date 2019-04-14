package com.juzi.wage.controller;

import com.juzi.wage.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 管理员操作
 *
 * @author Juzi
 * @date 2019/4/9 20:56
 * Blog https://juzibiji.top
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ExcelService excelService;

    @PostMapping("/excel/upload")
    @ResponseBody
    public String uploadExcel(@RequestParam(name = "excel",defaultValue = "null") MultipartFile file) throws IOException {
       if(file==null){
            return "上传文件不能为空";
       }
        InputStream inputStream = file.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        excelService.read(bufferedInputStream);
        return "上传成功";
    }

}
