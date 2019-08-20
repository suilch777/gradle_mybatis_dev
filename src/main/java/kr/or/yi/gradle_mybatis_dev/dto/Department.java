package kr.or.yi.gradle_mybatis_dev.dto;



public class Department {
	int dept_code;
	String dept_name;
	int floor;

	public Department() {
	}
	
	public Department(int deptNo, String deptName, int floor) {
		this.dept_code = deptNo;
		this.dept_name = deptName;
		this.floor = floor;
	}

	public Department(int deptNo) {
		this.dept_code = deptNo;
	}

	

	public int getDeptCode() {
		return dept_code;
	}

	public void setDeptCode(int deptCode) {
		this.dept_code = deptCode;
	}

	public String getDeptName() {
		return dept_name;
	}

	public void setDeptName(String deptName) {
		this.dept_name = deptName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s(%s층)", dept_name, floor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dept_code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (dept_code != other.dept_code)
			return false;
		return true;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return new Object[] { String.format("D%3d", dept_code), dept_name, floor };
	}

	
}
