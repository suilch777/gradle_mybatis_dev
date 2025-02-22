package kr.or.yi.gradle_mybatis_dev.dao;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.yi.gradle_mybatis_dev.AbstractTest;
import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.dto.Title;
import kr.or.yi.gradle_mybatis_dev.service.TransactionService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransactionServiceTest extends AbstractTest {
	private static TransactionService service = new TransactionService();

	@Test(expected = RuntimeException.class)
	public void test1Insert() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setCode(1);
		title.setName("사원");
		Department department = new Department(6, "H/W개발", 6);
		service.addTitleDepartment(title, department);

	}

	@Test(expected = RuntimeException.class)
	public void test2Insert() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setCode(7);
		title.setName("무기계약");
		Department department = new Department(1, "개발", 6);
		service.addTitleDepartment(title, department);
	}

	@Test
	public void test3Insert() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");

		Title title = new Title();
		title.setCode(7);
		title.setName("무기계약");
		log.debug(title.toString());

		Department department = new Department(6, "H/W개발", 6);
		log.debug(department.toString());

		int res = service.addTitleDepartment(title, department);
		log.debug("res " + res);
		Assert.assertEquals(2, res);
	}

	@Test(expected = RuntimeException.class)
	  public void test4Delete() {
	  log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
	  Title title = new Title(); title.setCode(8); title.setName("사원"); Department
	  department = new Department(6, "H/W개발",6);
	  service.removeTitleDepartment(title.getCode(), department.getDeptCode());
	  
	  }

	@Test(expected = RuntimeException.class)
	public void test5Delete() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setCode(7);
		title.setName("무기계약");
		Department department = new Department(10, "H/W개발", 6);
		service.removeTitleDepartment(title.getCode(), department.getDeptCode());

	}
	
	@Test
	public void test6Delete() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setCode(7);
		title.setName("무기계약");
		Department department = new Department(6, "H/W개발", 6);
		service.removeTitleDepartment(title.getCode(), department.getDeptCode());

	}

}
