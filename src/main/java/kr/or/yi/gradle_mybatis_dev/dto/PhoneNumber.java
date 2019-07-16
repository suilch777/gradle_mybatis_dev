package kr.or.yi.gradle_mybatis_dev.dto;

public class PhoneNumber {
	 private String countryCode;
	    private String stateCode;
	    private String number;
	    
	    public PhoneNumber() {}
	    public PhoneNumber(String countryCode, String stateCode, String number) {
	        this.countryCode = countryCode;
	        this.stateCode = stateCode;
	        this.number = number;
	    }
	    public PhoneNumber(String str){
	        if (str != null){
	            String[] parts = str.split(str, 0);
	            
	          
	    }
	   
	}

}
