package com.wjp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wjp.pojo.User;
import com.wjp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users.action")
	public String showUser(Model model) {
		List<User> users = userService.getUsers();
		
		model.addAttribute("userList",users);
		return "users";
	}
	
	@RequestMapping(value="/deleteUser.action",method=RequestMethod.GET)
	public ModelAndView userDelete(@RequestParam(value="username",required=false)String username) {

		userService.deleteUser(username);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("forward:/users.action");
		return modelAndView;
	}
	@RequestMapping(value="/userSearch.action",method=RequestMethod.GET)
	public String getUser(User user,HttpServletResponse response,HttpServletRequest request,Model model ) throws IOException {
		String username = request.getParameter("username");
		List<User> users =  userService.getUserByUsername(username);
		
		model.addAttribute("userList",users);
		return "users";
	}
}
