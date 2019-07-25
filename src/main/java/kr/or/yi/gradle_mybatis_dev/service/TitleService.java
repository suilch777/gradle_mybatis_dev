package kr.or.yi.gradle_mybatis_dev.service;

import java.util.List;

import kr.or.yi.gradle_mybatis_dev.dao.TitleDao;
import kr.or.yi.gradle_mybatis_dev.dao.TitleDaoImpl;
import kr.or.yi.gradle_mybatis_dev.dto.Title;

public class TitleService {
	private TitleDao dao;
	
	public TitleService() {
		dao = new TitleDaoImpl();
	}
	
	public List<Title> selectTitleByAll(){
		return dao.selectTitleByAll();
	}
	public Title selectTitleByCode(Title title) {
		return dao.selectTitleByCode(title);
	
	}
	public int insertTitile(Title title) {
		return dao.insertTitile(title);
	}
	public int deleteTitle(int code) {
		return dao.deleteTitle(code);
	}
	public int updateTitle(Title title) {
		return dao.updateTitle(title);
	}
}
