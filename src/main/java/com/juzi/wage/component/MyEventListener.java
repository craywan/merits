package com.juzi.wage.component;

import com.juzi.wage.config.MySystemConfig;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.io.*;
import java.lang.reflect.Field;
import java.util.List;

/**
 * 事件监听器
 *
 * @author Juzi
 * @date 2019/4/10 13:44
 * Blog https://juzibiji.top
 */
@Component
public class MyEventListener {

    @Autowired
    private MySystemConfig systemConfig;

    @Async
    @EventListener(classes = UploadExcelEvent.class)
    public void handleExcelUpload(UploadExcelEvent event) throws IOException {

        List<Object> data = event.getData();

        for (Object object : data) {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(systemConfig.getApplicationHomePath()+"/表头.xls"));
            //读取excel模板
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            //读取模板内sheet
            HSSFSheet sheet = wb.getSheetAt(0);

            // 获取object中所有属性
            Field[] fileds = object.getClass().getDeclaredFields();
            // 设置属性可访问
            fileds[0].setAccessible(true);
            // 工号
            String jobNumber = (String) ReflectionUtils.getField(fileds[0], object);


            for (int i = 1; i < sheet.getRow(0).getLastCellNum(); i++) {
                fileds[i - 1].setAccessible(true);
                String value = (String) ReflectionUtils.getField(fileds[i - 1], object);
                sheet.getRow(6).getCell(i).setCellValue(value);
            }


            File file3 = new File(systemConfig.getApplicationHomePath()+"/teacher/" + jobNumber + ".xls");
            if (!file3.getParentFile().exists()) {
                file3.getParentFile().mkdir();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            wb.write(fileOutputStream);
        }


    }

}
