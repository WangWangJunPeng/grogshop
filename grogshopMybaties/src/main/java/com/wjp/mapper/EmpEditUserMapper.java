package com.wjp.mapper;

import com.wjp.pojo.EmpEditUser;
import com.wjp.pojo.EmpEditUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpEditUserMapper {
    int countByExample(EmpEditUserExample example);

    int deleteByExample(EmpEditUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmpEditUser record);

    int insertSelective(EmpEditUser record);

    List<EmpEditUser> selectByExample(EmpEditUserExample example);

    EmpEditUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmpEditUser record, @Param("example") EmpEditUserExample example);

    int updateByExample(@Param("record") EmpEditUser record, @Param("example") EmpEditUserExample example);

    int updateByPrimaryKeySelective(EmpEditUser record);

    int updateByPrimaryKey(EmpEditUser record);
}