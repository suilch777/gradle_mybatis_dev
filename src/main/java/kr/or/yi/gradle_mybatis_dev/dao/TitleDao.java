package kr.or.yi.gradle_mybatis_dev.dao;


import java.util.List;

import kr.or.yi.gradle_mybatis_dev.dto.Title;

public interface TitleDao {
	List<Title> selectTitleByAll();
	Title selectTitleByCode(Title title);
	int insertTitle(Title title);
	int updateTitle(Title title);
	int deleteTitle(int code);
	
	
	
	
}
