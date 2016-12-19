package com.wjp.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wjp.pojo.EmpLimit;
import com.wjp.pojo.Employee;
import com.wjp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/login.action")
	public void employeeLogin(Employee employee, ModelMap model,HttpServletRequest request, HttpServletResponse response) {
		
		employee = employeeService.checkLogin(employee.getUsername(), employee.getPassword());
		// model.addAttribute("EmployeeLogin", employee);
		if (employee !=null) {
			model.addAttribute(employee);
			request.getSession().setAttribute("employee", employee);
		}else {
			try {
				response.getWriter().write("ERROR");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@RequestMapping("/employee.action")
	public ModelAndView showEmployee(@RequestParam(value="search",required=false)String search) {
		Map<Employee, EmpLimit> employeeLimtList = employeeService.employeeLimtList();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("employeeLimtList",employeeLimtList);
		modelAndView.setViewName("employee");
		return modelAndView;
	}
	@RequestMapping(value="/changeEmployee.action",method=RequestMethod.POST)
	public void employeeChange(Employee employee2,@RequestParam("code")String code,
			@RequestParam("id")Integer id,
			@RequestParam("username")String username,
			@RequestParam("phone")String phone,
			@RequestParam("email")String email,
			HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		int id2 = employee2.getId();
		
		HttpSession session = request.getSession();
		Employee employee = (Employee) session.getAttribute("employee");
		int id3 = employee.getId();

		int empLimitId = employeeService.selectEmployeeLimitId(code);
		employee2.setEmpLimitId(empLimitId);
		if (id2 == id3) {
			employeeService.changeEmployee(employee2);
			employee.setId(id);
			employee.setUsername(username);
			employee.setPhone(phone);
			employee.setPhone(email);
			employee.setEmpLimitId(empLimitId);
			
			session.setAttribute("employee", employee);
		} else {
			employeeService.changeEmployee(employee2);
		}
		response.getWriter().write(" ");
		return;
	}
	
	@RequestMapping(value="/insertEmployee.action",method=RequestMethod.POST)
	public void employeeAdd(Employee employee,@RequestParam("code")String code,HttpServletResponse res) throws IOException {
		int empLimitId = employeeService.selectEmployeeLimitId(code);
		employee.setEmpLimitId(empLimitId);
		employeeService.addEmployee(employee);
		res.getWriter().write(" ");
		return;
	}
	@RequestMapping(value="/deleteEmployee.action")
	public ModelAndView employeeDelete(@RequestParam(value="id",required=false)Integer id) {
		employeeService.deleteEmployee(id);
		ModelAndView modelAndView  = new ModelAndView();
		modelAndView.setViewName("forward:/employee.action");
//		System.out.println(id);
		return modelAndView;
	}
//	@RequestMapping("/login.action")
//	public String employeeLogin(@RequestParam(value = "username") String username,
//			@RequestParam(value = "password") String password, ModelMap model) {
//
//		Employee employee = employeeService.checkLogin(username, password);
//		model.addAttribute("EmployeeLogin", employee);
//		System.out.println(username+password);
//		
//		model.put("username", username);
//		model.put("password", password);
//		
//
//		return "login";
//	}
	
	
	@RequestMapping("/index.action")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/personal-info.action")
	public String personal_info() throws IOException {
		
		return "personal-info";
	}
	
	@RequestMapping(value="personal.action",method=RequestMethod.POST)
	public void infoChange(Employee employee, ModelMap model,HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String username1 = employee.getUsername();
		String email1 = employee.getEmail();
		String phone1 = employee.getPhone();
		
		HttpSession session = request.getSession();
		employee = (Employee) session.getAttribute("employee");
		
		if (username1.equals(employee.getUsername()) && email1.equals(employee.getEmail()) && phone1.equals(employee.getPhone())) {
			response.getWriter().write("您没修改任何内容");
		} else {
			employee.setUsername(username1);
			employee.setEmail(email1);
			employee.setPhone(phone1);
			int i = employeeService.changePersonal(employee);
			session.setAttribute("employee", employee);
			response.getWriter().write("修改成功");
		}
	}
	@RequestMapping("/password.action")
	public String password() {
		return "password";
	}
	@RequestMapping(value="/changPassword.action",method=RequestMethod.POST)
	public void passwordChange(Employee employee, ModelMap model,HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String oldPassword = request.getParameter("olderPassword");
		String newPassword = request.getParameter("newPassword");
		String againPassword = request.getParameter("againPassword");
//		System.out.println(oldPassword);
//		System.out.println(newPassword);
//		System.out.println(againPassword);
		
		HttpSession session = request.getSession();
		employee = (Employee) session.getAttribute("employee");
//		System.out.println(employee.getPassword());
		
		if (oldPassword == null || newPassword == null || againPassword == null) {
			response.getWriter().write("不能为空");
		} else if (oldPassword.equals(employee.getPassword()) && newPassword.equals(againPassword)) {
			employee.setPassword(newPassword);
			int i = employeeService.changePassword(employee);
//			System.out.println(i);
//			System.out.println(employee.getPassword());
			session.setAttribute("employee", employee);
			response.getWriter().write(" 密码修改成功");
		} else {
			response.getWriter().write(" 密码输入有误");
		}
	}
}
