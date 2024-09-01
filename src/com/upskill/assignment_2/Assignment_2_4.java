package com.upskill.assignment_2;

public class Assignment_2_4 {
	
	/* Problem 4. Write a for loop upto 500 which will increase the value double every time.*/

	public static void main(String[] args) {
		
		loopDoubleValue();
	}
	
	public static void loopDoubleValue(){
		
			for (int i = 1; i <= 500; i = i * 2) {
				System.out.println("Double values:" + i);
			}
			
//			for (int i = 500; i > 1; i = i/2) {
//				System.out.println("Double values:" + i);
//			}
	}


}
