package kr.or.yi.gradle_mybatis_dev.service;


import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.dto.Title;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

public class TransactionService {
	
	private String deptNamespace ="kr.or.yi.gradle_mybatis_dev.dao.DepartmentDao";
	private String titleNamespace="kr.or.yi.gradle_mybatis_dev.dao.TitleDao";
	
	public int addTitleDepartment(Title title, Department department) {
		int res=0;
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			res += sqlSession.insert(deptNamespace +".insertDepartment", department);
			res += sqlSession.insert(titleNamespace +".insertTitle", title);
			if(res==2)
				sqlSession.commit();
			else
				throw new Exception();
		} catch (Exception e) {
			sqlSession.rollback();
			throw new RuntimeException(e.getCause());
		}finally {
			sqlSession.close();
		}
		return res;
	}
	public void removeTitleDepartment(int code, int deptNo) {
		int res=0;
		SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
		try {
			res += sqlSession.delete(deptNamespace +".deleteDepartment", deptNo);
			res += sqlSession.delete(titleNamespace+".deleteTitle", code);
			if(res==2)
				sqlSession.commit();
			else
				throw new Exception();
			
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
			throw new RuntimeException(e.getCause());
			// TODO: handle exception
		}finally {
			sqlSession.close();
		}
	}

}
