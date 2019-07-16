package kr.or.yi.gradle_mybatis_dev.dto;

import java.util.Date;

public class Student {
	 private int studId;
	    private String name;
	    private String email;
	    private PhoneNumber phone;
	    private Date dob;
	    
	      //setter & getter method
	    
	    @Override
	    public String toString() {
	        return String.format("Student [%s, %s, %s, %s, %s]", studId, name, email,dob, phone);
	    }
	    
	}

