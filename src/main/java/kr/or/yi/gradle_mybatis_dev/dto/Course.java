package kr.or.yi.gradle_mybatis_dev.dto;

import java.util.Date;

public class Course {
	private int CourseID;
	private String name;
	private String description;
	private Date steartDate;
	private Date endDate;
	private int tutorId;
	public int getCourseID() {
		return CourseID;
	}
	public void setCourseID(int courseID) {
		CourseID = courseID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getSteartDate() {
		return steartDate;
	}
	public void setSteartDate(Date steartDate) {
		this.steartDate = steartDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	@Override
	public String toString() {
		return String.format("Course [CourseID=%s, name=%s, description=%s, steartDate=%s, endDate=%s, tutorId=%s]",
				CourseID, name, description, steartDate, endDate, tutorId);
	}
	
	

}
