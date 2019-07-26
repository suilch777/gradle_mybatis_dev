package kr.or.yi.gradle_mybatis_dev.dao;

import java.lang.Thread.State;
import java.util.Map;

public interface EmployeeDao {
	Map<String, Object> getSalaryByDepartment(Map<String, Object>param);
	Map<String, Object> getSalaryByDepartment2(Map<String, Object>param);
	State getSalaryByDepartment3(int param);
	
}
