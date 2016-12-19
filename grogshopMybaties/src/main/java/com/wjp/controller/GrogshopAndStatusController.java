package com.wjp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wjp.pojo.Grogshop;
import com.wjp.pojo.GrogshopAndStatus;
import com.wjp.service.GrogshopAndStatusService;
import com.wjp.service.GrogshopService;

@Controller
public class GrogshopAndStatusController {
	
	@Autowired
	private GrogshopAndStatusService grogshopAndStatusService;
	
	@RequestMapping("/shops.action")
	public String showGS(Model model) {
		List<GrogshopAndStatus> grogshopAndStatus = grogshopAndStatusService.getGrogshopStatus();
		model.addAttribute("grogshopAndStatus", grogshopAndStatus);
		return "shops";
	}
	
	@RequestMapping(value="/searchShops.action",method=RequestMethod.GET)
	public String getGrogshop(GrogshopAndStatus grogshopAndStatus,ModelMap model,HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		System.out.println(name);
		List<GrogshopAndStatus> grogshopList = grogshopAndStatusService.selectGrogshop(grogshopAndStatus);
		for (GrogshopAndStatus grogshopAndStatus2 : grogshopList) {
			System.out.println(grogshopAndStatus2);
		}
		
		model.addAttribute("grogshopAndStatus", grogshopList);
		return "shops";
	}
}	
