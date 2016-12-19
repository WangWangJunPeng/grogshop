package com.wjp.mapper;

import com.wjp.pojo.Employee;
import com.wjp.pojo.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
	
	List<Employee> selectEmployees();
	Employee selectEmployee(String username);
	int updateEmployee(Employee employee);
	int insert(Employee record);
	int deleteByPrimaryKey(Integer id);
	int updatePassword(Employee employee);
	
	
	int deleteByExample(Employee employee);
	int insertSelective(Employee record);
    int countByExample(EmployeeExample example);

    List<Employee> selectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}