package com.wjp.mapper;

import com.wjp.pojo.Grogshop;
import com.wjp.pojo.GrogshopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrogshopMapper {
	
	List<Grogshop> selectGrogshops();
	List<Grogshop> selectByName(String name);
	int updateById(Grogshop grogshop);
	
    int countByExample(GrogshopExample example);

    int deleteByExample(GrogshopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grogshop record);

    int insertSelective(Grogshop record);

    List<Grogshop> selectByExample(GrogshopExample example);

    Grogshop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grogshop record, @Param("example") GrogshopExample example);

    int updateByExample(@Param("record") Grogshop record, @Param("example") GrogshopExample example);

    int updateByPrimaryKeySelective(Grogshop record);

    int updateByPrimaryKey(Grogshop record);
}