package com.juzi.wage.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @ProjectName: wage
 * @Package: com.juzi.wage.util
 * @ClassName: DownloadExcel
 * @Author: wanzh
 * @Description: ${description}
 * @Date: 2019/4/12 0:22
 * @Version: 1.0
 */
public class DownloadExcel {
    /**
     * 下载excel
     */
    public static void downloadExcel(HttpServletRequest request, HttpServletResponse response,String userId,String appUrl) {


        //NIO成实现文件下载的操作
        File appFile = new File(appUrl);
        if(!appFile.exists()){
            try {
                response.sendRedirect("../lxxc/not_exits.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }
//        response.setContentType("application/ vnd.ms-excel");
        response.setContentType("application/octet-stream");
        //设置文件名字.很重要
        response.setHeader("Content-Disposition","attachment;filename="+userId+".xls");
        //建立输入流
        FileInputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            inputStream =new FileInputStream(appFile);
            //输出
            outputStream = response.getOutputStream();
            response.setHeader("Content-Length", String.valueOf(inputStream.available()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] bytes = new byte[1024];
        int len;
        try {
            while((len=inputStream.read(bytes))>0){
                    outputStream.write(bytes,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream!=null)
                inputStream.close();
                if(outputStream!=null)
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
