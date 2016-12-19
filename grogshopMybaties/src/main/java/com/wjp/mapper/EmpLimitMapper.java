package com.wjp.mapper;

import com.wjp.pojo.EmpLimit;
import com.wjp.pojo.EmpLimitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpLimitMapper {
	EmpLimit selectByCode(String code);
	
	
    int countByExample(EmpLimitExample example);

    int deleteByExample(EmpLimitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpLimit record);

    int insertSelective(EmpLimit record);

    List<EmpLimit> selectByExample(EmpLimitExample example);

    EmpLimit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpLimit record, @Param("example") EmpLimitExample example);

    int updateByExample(@Param("record") EmpLimit record, @Param("example") EmpLimitExample example);

    int updateByPrimaryKeySelective(EmpLimit record);

    int updateByPrimaryKey(EmpLimit record);
}