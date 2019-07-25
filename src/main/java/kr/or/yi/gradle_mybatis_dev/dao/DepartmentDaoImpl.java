package kr.or.yi.gradle_mybatis_dev.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

public class DepartmentDaoImpl implements DepartmentDao{
	private static final String Namespace = "kr.or.yi.gradle_mybatis_dev.dao.DepartmentDao";
	
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
	@Override
	public List<Department> selectDepartmentByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
		return	sqlSession.selectList(Namespace + ".selectDepartmentByAll");
			
	}

}


	


	@Override
	public Department selectDepartmentByCode(Department department) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return	sqlSession.selectOne(Namespace + ".selectDepartmentByCode", department);
		
	}
	
}

	@Override
	public int updateDepartment(Department department) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
		int res = 	sqlSession.update(Namespace + ".updateDepartment", department);
			sqlSession.commit();
			return res;
	}
}
}