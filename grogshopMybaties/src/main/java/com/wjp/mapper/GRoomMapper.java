package com.wjp.mapper;

import com.wjp.pojo.GRoom;
import com.wjp.pojo.GRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GRoomMapper {
    int countByExample(GRoomExample example);

    int deleteByExample(GRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GRoom record);

    int insertSelective(GRoom record);

    List<GRoom> selectByExample(GRoomExample example);

    GRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GRoom record, @Param("example") GRoomExample example);

    int updateByExample(@Param("record") GRoom record, @Param("example") GRoomExample example);

    int updateByPrimaryKeySelective(GRoom record);

    int updateByPrimaryKey(GRoom record);
}