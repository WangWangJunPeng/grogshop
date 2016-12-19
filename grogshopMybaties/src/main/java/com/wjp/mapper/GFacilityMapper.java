package com.wjp.mapper;

import com.wjp.pojo.GFacility;
import com.wjp.pojo.GFacilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GFacilityMapper {
    int countByExample(GFacilityExample example);

    int deleteByExample(GFacilityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GFacility record);

    int insertSelective(GFacility record);

    List<GFacility> selectByExample(GFacilityExample example);

    GFacility selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GFacility record, @Param("example") GFacilityExample example);

    int updateByExample(@Param("record") GFacility record, @Param("example") GFacilityExample example);

    int updateByPrimaryKeySelective(GFacility record);

    int updateByPrimaryKey(GFacility record);
}