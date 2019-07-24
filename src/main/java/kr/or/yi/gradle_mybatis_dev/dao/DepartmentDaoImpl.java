package kr.or.yi.gradle_mybatis_dev.dao;


import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

public class DepartmentDaoImpl implements DepartmentDao {
	private String Namespace = "kr.or.yi.gradle_mybatis_dev.dao";
	
	@Override
	public int insertDepartment(Department department) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(Namespace + ".insertDepartment", department);
			sqlSession.commit();
			return res;
		}
		
	}

	@Override
	public int deleteDepartment(int deptNo) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.delete(Namespace + ".deleteDepartment", deptNo);
			sqlSession.commit();
			return res;
		
	}

}
}
