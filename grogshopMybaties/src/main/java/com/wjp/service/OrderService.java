package com.wjp.service;

import java.util.List;

import com.wjp.pojo.Order;

public interface OrderService {
	List<Order> orders();
	int changeStatus(Order order);
	int deleteOrder(Integer id);
}
