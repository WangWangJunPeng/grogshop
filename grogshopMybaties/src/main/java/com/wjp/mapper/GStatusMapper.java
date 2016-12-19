package com.wjp.mapper;

import com.wjp.pojo.GStatus;
import com.wjp.pojo.GStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GStatusMapper {
    int countByExample(GStatusExample example);

    int deleteByExample(GStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GStatus record);

    int insertSelective(GStatus record);

    List<GStatus> selectByExample(GStatusExample example);

    GStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GStatus record, @Param("example") GStatusExample example);

    int updateByExample(@Param("record") GStatus record, @Param("example") GStatusExample example);

    int updateByPrimaryKeySelective(GStatus record);

    int updateByPrimaryKey(GStatus record);
}