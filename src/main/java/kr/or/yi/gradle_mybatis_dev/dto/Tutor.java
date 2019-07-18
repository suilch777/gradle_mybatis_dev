package kr.or.yi.gradle_mybatis_dev.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private Address asress;
	private List<Course>course;
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAsress() {
		return asress;
	}
	public void setAsress(Address asress) {
		this.asress = asress;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return String.format("Tutor [tutorId=%s, name=%s, email=%s, asress=%s, course=%s]", tutorId, name, email,
				asress, course);
	}
	
	

}
