package com.wjp.mapper;

import com.wjp.pojo.GFacilityHasGrogshopExample;
import com.wjp.pojo.GFacilityHasGrogshopKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GFacilityHasGrogshopMapper {
    int countByExample(GFacilityHasGrogshopExample example);

    int deleteByExample(GFacilityHasGrogshopExample example);

    int deleteByPrimaryKey(GFacilityHasGrogshopKey key);

    int insert(GFacilityHasGrogshopKey record);

    int insertSelective(GFacilityHasGrogshopKey record);

    List<GFacilityHasGrogshopKey> selectByExample(GFacilityHasGrogshopExample example);

    int updateByExampleSelective(@Param("record") GFacilityHasGrogshopKey record, @Param("example") GFacilityHasGrogshopExample example);

    int updateByExample(@Param("record") GFacilityHasGrogshopKey record, @Param("example") GFacilityHasGrogshopExample example);
}