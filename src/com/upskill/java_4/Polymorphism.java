package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	*/

	public static void main(String[] args) {
		car(true);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();	
	}
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int RentalIncome = 40000;
		int SideIncome = 40000;
		int SecondJob = 120000;
		int newIncome = calculateAnnualIncome + RentalIncome + SideIncome + SecondJob;
		System.out.println("My Annual Income = " + newIncome);
	}
	

	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("My car is Tesla !");
	}
	
	public static void car(String color){
		System.out.println("My car is : " + color);
	}
	
	public static void car(int seat){
		System.out.println("My car has Seat : " + seat);
	}
		
	public static void car(boolean ev){
		System.out.println("My car is EV : " + ev);
	}
	
	public static void car(String color, int seat){
		System.out.println("My car is : " + color + " . It has Seat : " + seat);	
	}
}