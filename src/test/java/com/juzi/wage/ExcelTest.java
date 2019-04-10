package com.juzi.wage;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.juzi.wage.component.MyEasyExcelListener;
import com.juzi.wage.model.dto.ExcelRowModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.junit.Test;

import java.io.*;
import java.text.FieldPosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Juzi
 * @date 2019/4/10 14:07
 * Blog https://juzibiji.top
 */
public class ExcelTest {

    @Test
    public void test1() throws IOException {
        File file1 = new File("src/main/resources/表头.xls");
        File file2 = new File("src/main/resources/excel.xls");
        InputStream inputStream1 = new FileInputStream(file1);
        InputStream inputStream2 = new FileInputStream(file2);
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(inputStream1);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream2);

        List<Object> datas = EasyExcelFactory.read(bufferedInputStream2, new Sheet(1, 6, ExcelRowModel.class));

        EasyExcelFactory.readBySax(bufferedInputStream1, new Sheet(1, 0, ExcelRowModel.class),new MyEasyExcelListener());

        // ============================================

        POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(file1));
        //读取excel模板
        HSSFWorkbook wb = new HSSFWorkbook(fs);
        //读取了模板内所有sheet内容
        HSSFSheet sheet = wb.getSheetAt(0);

        sheet.getRow(6).getCell(1).setCellValue("测试数据");

        File file3 = new File("src/main/resources/测试.xls");
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        wb.write(fileOutputStream);

        System.out.println(sheet);

    }

}
