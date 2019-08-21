package kr.or.yi.gradle_mybatis_dev.dao;

import java.util.List;

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
		Department department = new Department(7, "생산", 10);
		int res = deptDao.insertDepartment(department);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test03selectDepartmentByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Department> departmentlist = deptDao.selectDepartmentByAll();
		Assert.assertNotNull(departmentlist);

	}

	@Test
	public void test02deleteDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		int res = deptDao.deleteDepartment(7);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test04selectDepartmentByCode() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department();
		department.setDeptCode(2);
		Department searchDepartment = deptDao.selectDepartmentByCode(department);
		log.debug("searchDepartment:" + searchDepartment);
		Assert.assertNotNull(searchDepartment);

	}

	@Test
	public void test05updateDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department();
		department.setDeptCode(4);
		department.setDeptName("개발");
		department.setFloor(7);
		int res = deptDao.updateDepartment(department);
		Assert.assertEquals(1, res);

	}
}
