package com.wjp.service;

import java.util.List;
import java.util.Map;

import com.wjp.pojo.EmpLimit;
import com.wjp.pojo.Employee;

public interface EmployeeService {
	List<Employee> getEmployees();
	Employee checkLogin(String username, String password);
	int changePersonal(Employee employee);
	int changePassword(Employee employee);
	int changeEmployee(Employee employee);
	int addEmployee(Employee employee);
	
	Map<Employee, EmpLimit> employeeLimtList();
	
	int selectEmployeeLimitId(String code);
	
	int deleteEmployee(Integer id);
}
