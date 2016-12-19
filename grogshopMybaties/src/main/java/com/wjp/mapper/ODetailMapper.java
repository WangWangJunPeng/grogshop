package com.wjp.mapper;

import com.wjp.pojo.ODetail;
import com.wjp.pojo.ODetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ODetailMapper {
    int countByExample(ODetailExample example);

    int deleteByExample(ODetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ODetail record);

    int insertSelective(ODetail record);

    List<ODetail> selectByExample(ODetailExample example);

    ODetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ODetail record, @Param("example") ODetailExample example);

    int updateByExample(@Param("record") ODetail record, @Param("example") ODetailExample example);

    int updateByPrimaryKeySelective(ODetail record);

    int updateByPrimaryKey(ODetail record);
}