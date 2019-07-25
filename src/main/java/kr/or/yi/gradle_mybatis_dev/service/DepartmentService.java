package kr.or.yi.gradle_mybatis_dev.service;

import kr.or.yi.gradle_mybatis_dev.dao.DepartmentDao;
import kr.or.yi.gradle_mybatis_dev.dao.DepartmentDaoImpl;
import kr.or.yi.gradle_mybatis_dev.dto.Department;

public class DepartmentService {
	private DepartmentDao dao;
	
	public DepartmentService(){
		dao =new DepartmentDaoImpl();
		
	}

	public int insertDepartment(Department department) {
		return dao.insertDepartment(department);
	}
	public int deleteDepartment(int deptNo) {
		return dao.deleteDepartment(deptNo);
	}
}
