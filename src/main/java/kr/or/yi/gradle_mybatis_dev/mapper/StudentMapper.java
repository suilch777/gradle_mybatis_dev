package kr.or.yi.gradle_mybatis_dev.mapper;

import java.util.List;
import java.util.Map;

import kr.or.yi.gradle_mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNo(Student student);//typehandler�̿�
	Student selectStudentByNoWithResultMap(Student student);//resultmap�̿�
	
	List<Student> selectStudentByAll();
	List<Map<String, Object>> selectStudentMapByall();
	
	
	int insertStudent(Student student);

}
