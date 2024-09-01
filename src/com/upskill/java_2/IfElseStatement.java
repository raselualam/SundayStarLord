package com.upskill.java_2;

public class IfElseStatement {
	
	public static void main(String[] args){
		
		int age = 105;
		
		if (age <= 13){										//Condition - I
			System.out.println("You are children");			//Statement - I
		} else if(age > 13 && age < 18){					//Multiple logic in single condition -II
			System.out.println("You are Teenager");			//Statement - II
		} else if (age >= 60){								//Condition - III
			if(age < 100){									//Nested if else
				System.out.println("You are senior");		//Statement - with Nested
			} else {
				System.out.println("You are champion");		//Nested Alternative statement
			}
		} else {
			System.out.println("You are adult");			//Alternative statement
		}
	}
}