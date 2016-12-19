package com.wjp.mapper;

import com.wjp.pojo.EmpEditGrogshop;
import com.wjp.pojo.EmpEditGrogshopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpEditGrogshopMapper {
    int countByExample(EmpEditGrogshopExample example);

    int deleteByExample(EmpEditGrogshopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpEditGrogshop record);

    int insertSelective(EmpEditGrogshop record);

    List<EmpEditGrogshop> selectByExample(EmpEditGrogshopExample example);

    EmpEditGrogshop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpEditGrogshop record, @Param("example") EmpEditGrogshopExample example);

    int updateByExample(@Param("record") EmpEditGrogshop record, @Param("example") EmpEditGrogshopExample example);

    int updateByPrimaryKeySelective(EmpEditGrogshop record);

    int updateByPrimaryKey(EmpEditGrogshop record);
}