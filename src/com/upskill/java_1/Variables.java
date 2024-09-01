package com.upskill.java_1;

public class Variables {
	
//	Variables in Java
	
	//Instance OR global variable - Variables declared in Class level, outside method
	//Static variable - variables belong to class and don't required creating object
	//Local variable - variables declared in methods 
	//Method parameter - variables used as method parameter
	
	
	String country = "USA";					//Instance OR global variable - Variables declared in Class level, outside method
	
	static String region = "America";		//Static variable - variables belong to class and don't required creating object
	
	public static void main(String[] args) {
		String city = "New York";			//Local variable - variables declared in methods 
		michigan("Wayne");
		texas("Anderson");
	}
	
	public static void texas(String county){ 		//Method parameter - variables used as method parameter
		String city ="Dallas";				
		String myCounty = county;
		System.out.println(city);
		System.out.println(myCounty);
		System.out.println(region);
	}
	
	public static void michigan(String county){		//Method parameter - variables used as method parameter
		String city = "Detroit";					 
		String myCounty = county;
		System.out.println(city);
		System.out.println(myCounty);
		System.out.println(region);
	}

}