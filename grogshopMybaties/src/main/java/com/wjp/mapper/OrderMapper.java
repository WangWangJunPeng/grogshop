package com.wjp.mapper;

import com.wjp.pojo.Order;
import com.wjp.pojo.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
	
	List<Order> selectOrders();
	int updateOrderStatus(Order order);
	int deleteByPrimaryKey(Integer id);
	
	
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);


    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}