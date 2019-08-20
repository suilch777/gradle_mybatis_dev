package kr.or.yi.gradle_mybatis_dev.ui;

import java.util.List;

import kr.or.yi.gradle_mybatis_dev.dao.TitleDao;
import kr.or.yi.gradle_mybatis_dev.dao.TitleDaoImpl;
import kr.or.yi.gradle_mybatis_dev.dto.Title;
import kr.or.yi.gradle_mybatis_dev.ui.content.AbstractPanel;
import kr.or.yi.gradle_mybatis_dev.ui.content.PanelTitle;
import kr.or.yi.gradle_mybatis_dev.ui.list.AbstractListold;
import kr.or.yi.gradle_mybatis_dev.ui.list.TitleList;


@SuppressWarnings("serial")
public class TitleFrameUI extends AbstractFrameUI<Title> {
	private TitleDao dao;
	
	public TitleFrameUI(String title) {
		super(title);
	}
	
	@Override
	protected  void initDao() {
		dao = new TitleDaoImpl();
	}
	
	@Override
	protected AbstractListold<Title> createListPanel(){
		return new TitleList();
	}
	
	@Override
	protected AbstractPanel<Title> createContentPanel(){
		return new PanelTitle("직책 정보");
	}

	@Override
	protected void clearContent() {
		pContent.clearComponent(itemList.size() == 0 ? 1 : itemList.size() + 1);
	}
	
	@Override
	public List<Title> getListAll(){
		return dao.selectTitleByAll();
	}
	
	@Override
	protected int updateItem(Title item) {
		return dao.updateTitle(item);
	}

	@Override
	protected int insertItem(Title item) {
		return dao.insertTitle(item);
	}
	

	@Override
	protected int deleteItem(Title item) {
		return dao.deleteTitle(item);
	}
}
