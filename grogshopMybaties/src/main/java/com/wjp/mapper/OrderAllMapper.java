package com.wjp.mapper;

import java.util.List;

import com.wjp.pojo.OrderAll;

public interface OrderAllMapper {
	List<OrderAll> selectAllOrder();
	List<OrderAll> selectByExample(OrderAll orderAll);
	int deleteOrder(Integer id);
}
