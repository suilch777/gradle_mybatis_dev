package kr.or.yi.gradle_mybatis_dev.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_dev.dto.Title;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

public class TitleDaoImpl implements TitleDao {
	private static final String namespace = "kr.or.yi.gradle_mybatis_dev.dao.TitleDao";

	@Override
	public List<Title> selectTitleByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace + ".selectTitleByAll");
		}

	}

	@Override
	public Title selectTitleByCode(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectTitleByCode", title);
		}
	}

	@Override
	public int insertTitle(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace + ".insertTitle", title);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(int code) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.openSession()){
			int res =sqlsession.delete(namespace + ".deleteTitle", code);
			sqlsession.commit();
			return res;
		}
		
	}

	@Override
	public int updateTitle(Title title) {
		try(SqlSession sqlsession = MyBatisSqlSessionFactory.openSession()){
			int res =sqlsession.update(namespace + ".updateTitle", title);
			sqlsession.commit();
			return res;
		}
		
	}

	

	
	

}
