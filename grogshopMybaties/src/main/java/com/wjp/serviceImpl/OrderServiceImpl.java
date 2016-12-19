package com.wjp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjp.mapper.OrderMapper;
import com.wjp.pojo.Order;
import com.wjp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> orders() {
		List<Order> orders = orderMapper.selectOrders();
		return orderMapper.selectOrders();
	}

	public int changeStatus(Order order) {
		
		return orderMapper.updateOrderStatus(order);
	}

	public int deleteOrder(Integer id) {
		return orderMapper.deleteByPrimaryKey(id);
	}
}
