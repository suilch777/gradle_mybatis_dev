package kr.or.yi.gradle_mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_dev.dto.Student;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

public class StudentMapperImpl implements StudentMapper {
	private String namespace = "kr.or.yi.gradle_mybatis_dev_teacher.dao.StudentMapper";

	@Override
	public Student selectStudentByNo(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".selectStudentByNo", student);
		}
	}

	@Override
	public Student selectStudentByNoWithResultMap(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".selectStudentByNoWithResultMap", student);
		}
	}

	@Override
	public List<Student> selectStudentByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace + ".selectStudentByAll");
		}
	}

	@Override
	public int insertStudent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertStudent", student);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int insertStudentAutoInc(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertStudentAutoInc", student);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateStudent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".updateStudent", student);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteStudent(int id) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".deleteStudent", id);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public List<Map<String, Object>> selectStudentMapByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectList(namespace + ".selectStudentMapByAll");
		}
	}

	@Override
	public Student selectStudentByNoResultMapExtends(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".selectStudentByNoResultMapExtends", student);
		}
	}

}
