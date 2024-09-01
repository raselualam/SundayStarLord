package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "upskill";						//write & read
	
	private int ssn = 845758954;							//write only
	
	private String username = "raselalam";					//read only
	
	//Setter Method - name						 			//set the data, Write
	public void setName(String value){			
		name = value;
	}
	
	//Getter Method - name		 							//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						 			//set the data, Write
	public void setSSN(int value){			
		ssn = value;
	}
	
	//Getter Method - username		 						//get the data, Read
	public String getUserName(){
		return username;
	}
	
	//	dob, dl, address
	
	private String address = "82-11 37th Ave, NYC";			//write & read
	
	private int dob = 845758954;							//write only
	
	private int dl = 79845254;								//read only
	
}