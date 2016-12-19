package com.wjp.service;

import java.util.List;

import com.wjp.pojo.OrderAll;

public interface OrderAllService {
	List<OrderAll> selectOrderAll();
	List<OrderAll> selectOrder(OrderAll orderAll);
}
