package kr.or.yi.gradle_mybatis_dev.dto;



public class Department {
	int deptCode;
	String deptName;
	int floor;

	public Department() {
	}
	
	public Department(int deptNo, String deptName, int floor) {
		this.deptCode = deptNo;
		this.deptName = deptName;
		this.floor = floor;
	}

	public Department(int deptNo) {
		this.deptCode = deptNo;
	}

	

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s(%s층)", deptName, floor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deptCode;
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
		if (deptCode != other.deptCode)
			return false;
		return true;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return new Object[] { String.format("D%3d", deptCode), deptName, floor };
	}

	
}
