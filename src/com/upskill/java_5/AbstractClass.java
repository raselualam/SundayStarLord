package com.upskill.java_5;

public abstract class AbstractClass {
	
	//Abstract class has both abstract method and regular method
	
	public void car(){
		System.out.println("My car is Tesla");
	}

	public abstract void iDoor();
	
	public abstract String iEngine();
	
	public abstract int iWheel();
}


/*
(Parent)				   (Keyword) 				(Child)					 (Keyword) 					(GrandChild)
						
Class						extends					 Class		 
Abstract Class(2)			extends					 Class(2->0)
Interface(2) 			  	implements				 Class(2->0)
Interface(2) 				extends					 Interface(2+2) 			implements					Class(4->0)
Interface(2) 		  		implements				 Abstract Class(2->0)
*/