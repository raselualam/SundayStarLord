package com.upskill.assignment_1;

public class Assignment_1_4 {

	
	/* Problem 04: A function returns 30, another function returns 50. 
	Write a java program which will display subtraction value from bigger number to smaller.*/


		public static int functionReturn30(){
			return 30;
		}
		
		public static int functionReturn50(){
			return 50;
		}
		
		public static void main(String[] args) {
			
			int subtractionValue = functionReturn50()-functionReturn30();
			
			System.out.println("Subtraction value from bigger function to smaller = " + subtractionValue );	
		}
	
}
