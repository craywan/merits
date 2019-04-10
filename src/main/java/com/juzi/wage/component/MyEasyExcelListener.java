package com.juzi.wage.component;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.juzi.wage.model.dto.ExcelRowModel;

/**
 * @author Juzi
 * @date 2019/4/10 14:10
 * Blog https://juzibiji.top
 */
public class MyEasyExcelListener extends AnalysisEventListener<ExcelRowModel> {


    @Override
    public void invoke(ExcelRowModel object, AnalysisContext context) {
        System.out.println("213123");
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
