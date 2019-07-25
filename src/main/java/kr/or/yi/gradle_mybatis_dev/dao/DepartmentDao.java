package kr.or.yi.gradle_mybatis_dev.dao;


import java.util.List;

import kr.or.yi.gradle_mybatis_dev.dto.Department;

public interface DepartmentDao {
	int insertDepartment(Department department);
	int deleteDepartment(int deptNo);
	List<Department> selectDepartmentByAll();
	Department selectDepartmentByCode(Department department);
	int updateDepartment(Department department);
	

}
