package com.wjp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wjp.pojo.Grogshop;
import com.wjp.service.GrogshopService;

@Controller
public class GrogshopController {
	
	@Autowired
	private GrogshopService grogshopService;
	
	@RequestMapping("/aaaashops.action")
	public String showGrogshop(Model model) {
		
		List<Grogshop> grogshops = grogshopService.getGrogshops();
		
		model.addAttribute("bbb", grogshops);
		return "aaashops";
	}
	
	@RequestMapping("/statusPass.action")
	public ModelAndView grogshopStatusPass(Grogshop grogshop, @RequestParam("id")Integer id) {
		//System.out.println(grogshop);
		grogshop.setgStatusId(2);
		//System.out.println(grogshop);
		grogshopService.changeStatus(grogshop);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/shops.action");
		return modelAndView;
	}
	@RequestMapping("/statusBreak.action")
	public ModelAndView grogshopStatusBreak(Grogshop grogshop, @RequestParam("id")Integer id) {
		
		grogshop.setgStatusId(1);
		grogshopService.changeStatus(grogshop);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/shops.action");
		return modelAndView;
	}
}
