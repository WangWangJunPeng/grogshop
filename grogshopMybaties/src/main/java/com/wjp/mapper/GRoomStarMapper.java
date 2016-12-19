package com.wjp.mapper;

import com.wjp.pojo.GRoomStar;
import com.wjp.pojo.GRoomStarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GRoomStarMapper {
    int countByExample(GRoomStarExample example);

    int deleteByExample(GRoomStarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GRoomStar record);

    int insertSelective(GRoomStar record);

    List<GRoomStar> selectByExample(GRoomStarExample example);

    GRoomStar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GRoomStar record, @Param("example") GRoomStarExample example);

    int updateByExample(@Param("record") GRoomStar record, @Param("example") GRoomStarExample example);

    int updateByPrimaryKeySelective(GRoomStar record);

    int updateByPrimaryKey(GRoomStar record);
}