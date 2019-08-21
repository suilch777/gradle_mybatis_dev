package kr.or.yi.gradle_mybatis_dev.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;

import kr.or.yi.gradle_mybatis_dev.dto.Department;
import kr.or.yi.gradle_mybatis_dev.dto.Employee;
import kr.or.yi.gradle_mybatis_dev.dto.State;
import kr.or.yi.gradle_mybatis_dev.jdbc.MyBatisSqlSessionFactory;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final String namespace="kr.or.yi.gradle_mybatis_dev.dao.EmployeeDao";


	@Override
	public Map<String, Object> getSalaryByDepartment(Map<String, Object> param) {
		Map<String, Object> map = new HashMap<>();
		ResultHandler<State> resultHandler =new ResultHandler<State>() {
			@Override
			public void handleResult(ResultContext<? extends State> resultContext) {
				 State state= resultContext.getResultObject();
				 map.put(state.getDepartment(), state.getTotal());
				
			}
		};
		try(SqlSession sqlSession =MyBatisSqlSessionFactory.openSession()){
			sqlSession.select(namespace + ".getSalaryByDepartment", param, resultHandler);
		}
		return map;
	}

	@Override
	public Map<String, Object> getSalaryByDepartment2(Map<String, Object> param) {
		Map<String, Object> map = new HashMap<>();
		ResultHandler<State> resultHandler =new ResultHandler<State>() {
			@Override
			public void handleResult(ResultContext<? extends State> resultContext) {
				 State state= resultContext.getResultObject();
				 map.put(state.getDepartment(), state.getTotal());
				
			}
		};
		try(SqlSession sqlSession =MyBatisSqlSessionFactory.openSession()){
			sqlSession.select(namespace + ".getSalaryByDepartment", param, resultHandler);
		}
		return map;
	}

	@Override
	public State getSalaryByDepartment3(int param) {
		try(SqlSession sqlSession =MyBatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace + ".getSalaryByDepartment3", param);
		
	}

}

	@Override
	public int insertEmployee(Employee employee) {
		try(SqlSession sqlSession =MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.insert(namespace + ".insertEmployee", employee);
			sqlSession.commit();
			return res;
		}
		
	}

	@Override
	public int deleteEmployee(int empNo) {
		try(SqlSession sqlSession =MyBatisSqlSessionFactory.openSession()){
			int res = sqlSession.delete(namespace + ".deleteEmployee", empNo);
			sqlSession.commit();
		  return res;
		} 
	}

	@Override
	public List <Employee> selectEmployeeByAll() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return	sqlSession.selectList(namespace + ".selectEmployeeByAll");
		}		
	}

	@Override
	public Employee selectEmployeeByCode(Employee employee) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			return	sqlSession.selectOne(namespace + ".selectEmployeeByCode", employee);
	}
	}
	@Override
	public int updateEmployee(Employee employee) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()){
			int res = 	sqlSession.update(namespace + ".updateEmployee",employee );
				sqlSession.commit();
				return res;
	}
	}
}

