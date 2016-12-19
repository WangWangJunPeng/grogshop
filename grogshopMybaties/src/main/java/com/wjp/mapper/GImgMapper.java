package com.wjp.mapper;

import com.wjp.pojo.GImg;
import com.wjp.pojo.GImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GImgMapper {
    int countByExample(GImgExample example);

    int deleteByExample(GImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GImg record);

    int insertSelective(GImg record);

    List<GImg> selectByExample(GImgExample example);

    GImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GImg record, @Param("example") GImgExample example);

    int updateByExample(@Param("record") GImg record, @Param("example") GImgExample example);

    int updateByPrimaryKeySelective(GImg record);

    int updateByPrimaryKey(GImg record);
}