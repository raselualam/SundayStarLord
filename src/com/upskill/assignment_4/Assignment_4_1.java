package com.upskill.assignment_4;

public class Assignment_4_1 {
	
	/*	Write a USER PROGRAM using encapsulation that contains the username, password, email, 
	  first and last names of a user of our application. Display the user information in console output. */

    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String email;
    
    public void setFirstName (String first_name) { 
    	firstname = first_name ;
   	    }
    
    public void setLastName (String last_name) {
    	lastname = last_name ;
        }
    
    public void setUserName (String user_name) {
    	username = user_name ;
    	    }
    public void setpassword (String pwd) {
    	password = pwd ;
    	    }
    public void setemail (String Email) {
    	email = Email ;
    	    }
    
    public String getFirstName () {
    	return firstname;
    }
    public String getLastName () {
    	return lastname;
    }
    public String getUserName () {
    	return username;
    }
    public String getpassword () {
    	return password;
    }
    public String getemail () {
    	return email;
    }
	
	public static void main(String[] args) {
	
		Assignment_4_1 obj = new Assignment_4_1 ();
		
		obj.setFirstName("Sanjana");
		obj.setLastName("Haque");
        obj.setUserName("sanjana_h");
        obj.setpassword("abc123");
        obj.setemail("shanjanahaque@gmail.com");
        
        
        System.out.println("USER information: ");
        System.out.println(" First Name: " + obj.getFirstName());
        System.out.println(" Last Name: " + obj.getLastName());
        System.out.println(" User Name: " + obj.getUserName());
        System.out.println(" Password: " + obj.getpassword());
        System.out.println(" Email: " + obj.getemail());
	}
}