package kr.or.yi.gradle_mybatis_dev.dto;

public class State {
	private String department;
	private int total;
	
	public State() {
	}
	
	public State(String department, int total) {
		this.department = department;
		this.total = total;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return String.format("State [Department=%s, total=%s]", department, total);
	}
	
	
	

}
