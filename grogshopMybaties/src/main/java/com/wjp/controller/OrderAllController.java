package com.wjp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wjp.pojo.OrderAll;
import com.wjp.service.OrderAllService;

@Controller
public class OrderAllController {
	
	@Autowired
	private OrderAllService orderAllService;
	
	@RequestMapping("/orders.action")
	public String shouAllOrder(Model model) {
		
		List<OrderAll> orderAlls = orderAllService.selectOrderAll();
		model.addAttribute("orderAll", orderAlls);
		return "orders";
	}
	
	@RequestMapping(value="/searchOrder.action")
	public String getOrder(OrderAll orderAll,ModelMap model,HttpServletRequest request, HttpServletResponse response) {
		
		int abc;
		//String id = request.getParameter("id");
		try {
			System.out.println(request.getParameter("abc"));
			abc =Integer.parseInt( request.getParameter("abc"));
		} catch (Exception e) {
			List<OrderAll> orderAlls = orderAllService.selectOrderAll();
			model.addAttribute("orderAll", orderAlls);
			return "orders";
		}
 		orderAll.setId(abc);
		List<OrderAll> orderList = orderAllService.selectOrder(orderAll);
		for (OrderAll orderAll2 : orderList) {
			System.out.println(orderAll2);
		}
		model.addAttribute("orderAll", orderList);
		return "orders";
	}
	
}
