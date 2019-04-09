package com.juzi.wage.service;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.juzi.wage.WageApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * @author Juzi
 * @date 2019/4/9 21:19
 * Blog https://juzibiji.top
 */
public class ExcelServiceTests extends WageApplicationTests {

    @Autowired
    private ExcelService excelService;

    @Test
    public void testRead() throws IOException {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("excel.xls");
        List<Object> data = EasyExcelFactory.read(inputStream, new Sheet(1, 0));
        inputStream.close();
        print(data);
    }

}
