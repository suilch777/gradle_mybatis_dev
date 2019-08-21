package kr.or.yi.gradle_mybatis_dev.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_dev.AbstractTest;
import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.dto.Employee;
import kr.or.yi.gradle_mybatis_dev.dto.State;
import kr.or.yi.gradle_mybatis_dev.dto.Title;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDaoTest extends AbstractTest {
	private static EmployeeDao empDao = new EmployeeDaoImpl();

	@Test
	public void test1getSalaryByDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Map<String, Object> param = new HashMap<>();
		param.put("deptno", 1);
		Map<String, Object> map = empDao.getSalaryByDepartment(param);
		Assert.assertNotSame(0, map.size());
	}

	@Test
	public void test2getSalaryByDepartment2() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Map<String, Object> param = new HashMap<>();
		param.put("deptno", 1);
		Map<String, Object> map = empDao.getSalaryByDepartment2(param);
		Assert.assertNotSame(0, map.size());
	}

	@Test
	public void test3getSalaryByDepartment3() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		State state = empDao.getSalaryByDepartment3(1);
		Assert.assertNotNull(state);
	}

	@Test
	public void test4insertEmployee() {
		Calendar newDate = GregorianCalendar.getInstance();

		Employee employee = new Employee(2004, "김철수", 1500000, new Department(2), true, new Date(2001-02-03), new Title(2));
		int res = empDao.insertEmployee(employee);
		Assert.assertEquals(1, res);
	}

}
