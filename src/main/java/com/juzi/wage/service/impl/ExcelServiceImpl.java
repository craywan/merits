package com.juzi.wage.service.impl;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import com.juzi.wage.dao.TeacherMapper;
import com.juzi.wage.dao.WageMapper;
import com.juzi.wage.model.dto.ExcelRowModel;
import com.juzi.wage.model.entity.Teacher;
import com.juzi.wage.model.entity.Wage;
import com.juzi.wage.service.ExcelService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * @author Juzi
 * @date 2019/4/9 21:06
 * Blog https://juzibiji.top
 */
@Service
public class ExcelServiceImpl implements ExcelService {

    /**
     * 教师信息表接口
     */
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 教师工资表接口
     */
    @Autowired
    private WageMapper wageMapper;

    @Override
    public void read(BufferedInputStream inputStream) throws IOException {

        // 读取excel（限1000行内）
        List<Object> datas = EasyExcelFactory.read(inputStream, new Sheet(1, 6, ExcelRowModel.class));

        // 遍历数据
        for (Object data : datas) {
            Teacher teacher = new Teacher();
            Wage wage = new Wage();

            // 复制属性
            BeanUtils.copyProperties(data, teacher);
            BeanUtils.copyProperties(data, wage);

            // 没有工号，不记录此条数据
            if(teacher.getJobNumber()==null){
                continue;
            }

            // 教师信息数据
            if (teacherMapper.selectByPrimaryKey(teacher.getJobNumber()) == null) {
                // 数据库无该教师基本信息时则直接插入
                teacherMapper.insertSelective(teacher);
            } else {
                // 数据库有该教师基本信息时则更新覆盖
                teacherMapper.updateByPrimaryKeySelective(teacher);
            }

            // 教师工资数据
            if (wageMapper.selectByPrimaryKey(wage.getJobNumber()) == null) {
                // 数据库无该教师工资信息时直接插入
                wageMapper.insertSelective(wage);
            } else {
                // 数据库有该教师工资信息时更新覆盖
                wageMapper.updateByPrimaryKey(wage);
            }
        }
        inputStream.close();
    }
}
