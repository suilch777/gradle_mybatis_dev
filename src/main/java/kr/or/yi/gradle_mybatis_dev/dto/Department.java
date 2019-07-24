package kr.or.yi.gradle_mybatis_dev.dto;

public class Department {
	int dept_code;
	String dept_name;
	int floor;
	public Department() {
	}
	public Department(int dept_code, String dept_name, int floor) {
		this.dept_code = dept_code;
		this.dept_name = dept_name;
		this.floor = floor;
	}
	public int getDept_code() {
		return dept_code;
	}
	public void setDept_code(int dept_code) {
		this.dept_code = dept_code;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	@Override
	public String toString() {
		return String.format("Department [dept_code=%s, dept_name=%s, floor=%s]", dept_code, dept_name, floor);
	}

}
