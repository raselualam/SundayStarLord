package com.upskill.java_1;

public class MethodType {
	
/* 	Types of Methods
	 
	1.Void Method
	2.Static Method
	3.Return Type Method  
 */
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		weeklyIncomeStatic();
		
		MethodType MethodTypeObj = new MethodType(); //className ObjName = new className();
		MethodTypeObj.annualIncomeVoid();
		System.out.println("My Monthly Income = " + MethodTypeObj.monthlyIncomeReturn());
	}
	
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public String ourName(){
		String name = "Ahsan";
		return name;
	}
	
	//static method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
}