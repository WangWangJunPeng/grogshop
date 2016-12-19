package com.wjp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjp.mapper.OrderAllMapper;
import com.wjp.pojo.OrderAll;
import com.wjp.service.OrderAllService;

@Service
public class OrderAllServiceImpl implements OrderAllService{
	
	@Autowired
	private OrderAllMapper orderAllMapper;
	
	public List<OrderAll> selectOrderAll() {
		List<OrderAll> orderAlls = orderAllMapper.selectAllOrder();
		return orderAllMapper.selectAllOrder();
	}

	public List<OrderAll> selectOrder(OrderAll orderAll) {
		List<OrderAll> orders = orderAllMapper.selectByExample(orderAll);
		return orderAllMapper.selectByExample(orderAll);
	}
}
