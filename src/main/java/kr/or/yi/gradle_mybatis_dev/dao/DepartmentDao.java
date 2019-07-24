package kr.or.yi.gradle_mybatis_dev.dao;


import kr.or.yi.gradle_mybatis_dev.dto.Department;

public interface DepartmentDao {
	int insertDepartment(Department department);
	int deleteDepartment(int deptNo);
	
	

}
