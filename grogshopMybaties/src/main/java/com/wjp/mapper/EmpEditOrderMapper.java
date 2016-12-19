package com.wjp.mapper;

import com.wjp.pojo.EmpEditOrder;
import com.wjp.pojo.EmpEditOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpEditOrderMapper {
    int countByExample(EmpEditOrderExample example);

    int deleteByExample(EmpEditOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpEditOrder record);

    int insertSelective(EmpEditOrder record);

    List<EmpEditOrder> selectByExample(EmpEditOrderExample example);

    EmpEditOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpEditOrder record, @Param("example") EmpEditOrderExample example);

    int updateByExample(@Param("record") EmpEditOrder record, @Param("example") EmpEditOrderExample example);

    int updateByPrimaryKeySelective(EmpEditOrder record);

    int updateByPrimaryKey(EmpEditOrder record);
}