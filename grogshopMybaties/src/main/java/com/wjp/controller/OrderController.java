package com.wjp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wjp.pojo.Order;
import com.wjp.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/checkIn.action")
	public ModelAndView orderIn(Order order, @RequestParam("id")Integer id ) {
		order.setOrderStatusId(2);
		orderService.changeStatus(order);
		ModelAndView modelAndVIew = new ModelAndView();
		modelAndVIew.setViewName("forward:/orders.action");
		return modelAndVIew;
	}
	
	@RequestMapping(value="/checkOut.action")
	public ModelAndView orderOut(Order order,  @RequestParam("id")Integer id ) {
		order.setOrderStatusId(3);
		orderService.changeStatus(order);
		ModelAndView modelAndVIew = new ModelAndView();
		modelAndVIew.setViewName("forward:/orders.action");
		return modelAndVIew;
	}
	
	@RequestMapping(value="/deleteOrder.action")
	public ModelAndView orderDelete(@RequestParam(value="id",required=false)Integer id) {
		orderService.deleteOrder(id);
		ModelAndView modelAndView  = new ModelAndView();
		modelAndView.setViewName("forward:/orders.action");
		System.out.println(id);
		return modelAndView;
	}
}
