package com.wjp.mapper;

import com.wjp.pojo.GStar;
import com.wjp.pojo.GStarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GStarMapper {
    int countByExample(GStarExample example);

    int deleteByExample(GStarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GStar record);

    int insertSelective(GStar record);

    List<GStar> selectByExample(GStarExample example);

    GStar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GStar record, @Param("example") GStarExample example);

    int updateByExample(@Param("record") GStar record, @Param("example") GStarExample example);

    int updateByPrimaryKeySelective(GStar record);

    int updateByPrimaryKey(GStar record);
}