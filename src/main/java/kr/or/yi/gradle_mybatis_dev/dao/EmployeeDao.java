package kr.or.yi.gradle_mybatis_dev.dao;


import java.util.List;
import java.util.Map;

import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.dto.Employee;
import kr.or.yi.gradle_mybatis_dev.dto.State;

public interface EmployeeDao {
	Map<String, Object> getSalaryByDepartment(Map<String, Object>param);
	Map<String, Object> getSalaryByDepartment2(Map<String, Object>param);
	State getSalaryByDepartment3(int param);
	int insertEmployee(Employee employee);
	int deleteEmployee(int empNo);
	List<Employee> selectEmployeeByAll();
	Employee selectEmployeeByCode(Employee employee);
	int updateEmployee(Employee employee);
}
