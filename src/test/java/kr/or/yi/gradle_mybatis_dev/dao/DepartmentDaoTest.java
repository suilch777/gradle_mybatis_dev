package kr.or.yi.gradle_mybatis_dev.dao;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_dev.AbstractTest;
import kr.or.yi.gradle_mybatis_dev.dto.Department;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest extends AbstractTest {
	private static DepartmentDao deptDao = new DepartmentDaoImpl();

	
	@Test
	public void test01insertDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(7, "생산",10);
			int res = deptDao.insertDepartment(department);
			Assert.assertEquals(1, res);
			}
	@Test
	public void test02deleteDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		int res = deptDao.deleteDepartment(7);
		Assert.assertEquals(1, res);
			}		
	
		
	}


