package com.juzi.wage.dao;

import com.juzi.wage.model.entity.Wage;
import com.juzi.wage.model.entity.WageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WageMapper {
    long countByExample(WageExample example);

    int deleteByExample(WageExample example);

    int deleteByPrimaryKey(String jobNumber);

    int insert(Wage record);

    int insertSelective(Wage record);

    List<Wage> selectByExample(WageExample example);

    Wage selectByPrimaryKey(String jobNumber);

    int updateByExampleSelective(@Param("record") Wage record, @Param("example") WageExample example);

    int updateByExample(@Param("record") Wage record, @Param("example") WageExample example);

    int updateByPrimaryKeySelective(Wage record);

    int updateByPrimaryKey(Wage record);
}