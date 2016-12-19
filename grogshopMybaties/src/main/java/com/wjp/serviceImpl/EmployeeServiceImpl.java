package com.wjp.serviceImpl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjp.mapper.EmpLimitMapper;
import com.wjp.mapper.EmployeeMapper;
import com.wjp.pojo.EmpLimit;
import com.wjp.pojo.Employee;
import com.wjp.service.EmployeeService;

@Service//("employeeService")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeMapper employeeMapper;
	@Autowired
	private EmpLimitMapper empLimitMapper;
	
	public List<Employee> getEmployees() {
		return employeeMapper.selectEmployees();
	}

	public Employee checkLogin(String username, String password) {
		Employee employee  = employeeMapper.selectEmployee(username);
		if (employee !=null && password.equals(employee.getPassword())) {
			return employee;
		}
		return null;
	}

	public int changePersonal(Employee employee) {
		
		return employeeMapper.updateEmployee(employee);
	}

	public int changePassword(Employee employee) {
		
		return employeeMapper.updatePassword(employee);
	}

	public int changeEmployee(Employee employee) {
		return employeeMapper.updateEmployee(employee);
	}
	public int selectEmployeeLimitId(String code) {
		return empLimitMapper.selectByCode(code).getId();
	}
	
	public Map<Employee, EmpLimit> employeeLimtList() {
		Map<Employee, EmpLimit> employeeLimtList = new LinkedHashMap<Employee, EmpLimit>();
		for (Employee employee : employeeMapper.selectEmployees()) {
			employeeLimtList.put(employee, empLimitMapper.selectByPrimaryKey(employee.getEmpLimitId()));
		}
		
		return employeeLimtList;
	}

	public int addEmployee(Employee employee) {

		return employeeMapper.insert(employee);
	}

	public int deleteEmployee(Integer id) {
		
		return employeeMapper.deleteByPrimaryKey(id);
	}
}
