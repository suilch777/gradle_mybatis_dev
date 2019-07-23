package kr.or.yi.gradle_mybatis_dev.dao;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.yi.gradle_mybatis_dev.AbstractTest;
import kr.or.yi.gradle_mybatis_dev.dto.Title;

public class TitleDaoTest extends AbstractTest {
	private static TitleDao titleDao;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		titleDao = new TitleDaoImpl();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		titleDao = null;
	}

	@Test
	public void test01insertTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setCode(3);
		title.setName("과장");
		int res = titleDao.insertTitile(title);
		Assert.assertEquals(1, res);

	}

	@Test
	public void test02selectTitleByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Title> titlelist = titleDao.selectTitleByAll();
		Assert.assertNotNull(titlelist);

	}

	@Test
	public void test03selectTitleByCode() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setCode(2);
		Title searchTitle =	titleDao.selectTitleByCode(title);
		log.debug("searchTitle : " + searchTitle);
		Assert.assertNotNull(searchTitle);

	}

}
