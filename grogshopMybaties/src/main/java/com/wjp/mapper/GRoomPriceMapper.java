package com.wjp.mapper;

import com.wjp.pojo.GRoomPrice;
import com.wjp.pojo.GRoomPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GRoomPriceMapper {
    int countByExample(GRoomPriceExample example);

    int deleteByExample(GRoomPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GRoomPrice record);

    int insertSelective(GRoomPrice record);

    List<GRoomPrice> selectByExample(GRoomPriceExample example);

    GRoomPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GRoomPrice record, @Param("example") GRoomPriceExample example);

    int updateByExample(@Param("record") GRoomPrice record, @Param("example") GRoomPriceExample example);

    int updateByPrimaryKeySelective(GRoomPrice record);

    int updateByPrimaryKey(GRoomPrice record);
}