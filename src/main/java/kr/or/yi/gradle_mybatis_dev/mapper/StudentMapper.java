package kr.or.yi.gradle_mybatis_dev.mapper;

import java.util.List;

import kr.or.yi.gradle_mybatis_dev.dto.Student;

public interface StudentMapper {
	Student selectStudentByNo(Student student);//typehandler�̿�
	Student selectStudentByNoWithResultMap(Student student);//resultmap�̿�
	
	List<Student> selectStudentByAll();
	
	int insertStudent(Student student);

}
