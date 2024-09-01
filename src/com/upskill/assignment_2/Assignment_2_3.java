package com.upskill.assignment_2;

public class Assignment_2_3 {
	
	/* Problem3. Write two java functions which will return two different integer values,    
	write a program to compare those numbers and send message that one number is bigger than other. 
	(hints: using if..else)*/


	public static void main(String[] args) {

		compareNumbers();
		
	}
	
	public static int myFunction1(){
		int a=34;
		return a;
	}
	
	public static int myFunction2(){
		int b=34;
		return b;
	}
	
	public static void compareNumbers(){
		if (myFunction1()>myFunction2()){	
			System.out.println("1st Function is bigger then 2nd Function");}
		else if (myFunction1()==myFunction2()){
			System.out.println("Both Function has the same value");}
		else {
			System.out.println("2nd Function is bigger then 1st Function");}
	}
}
