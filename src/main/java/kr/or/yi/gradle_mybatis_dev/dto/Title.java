package kr.or.yi.gradle_mybatis_dev.dto;

public class Title {
	int code;
	String name;
	
	public Title() {
	}
	public Title(int code, String name) {
		this.code = code;
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("Title [code=%s, name=%s]", code, name);
	}
	
	
	
	
}
