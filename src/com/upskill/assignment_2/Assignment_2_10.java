package com.upskill.assignment_2;

import java.util.Scanner;

public class Assignment_2_10 {

	/* Problem10. Write a Java program to convert temperature from Fahrenheit to Celsius degree.  */
	
	public static void main(String[] args) {
		convertTemp();
	}

	
	public static void convertTemp() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		double farn, cels;
		
		System.out.print("Enter Fahrenheit Temperature = ");
		farn = input.nextDouble();
		cels = (farn -32)*5/9;
		
		System.out.println("So in Celsious : "+ cels);
	}



}
