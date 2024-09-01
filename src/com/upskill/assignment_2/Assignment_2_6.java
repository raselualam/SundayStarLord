package com.upskill.assignment_2;

public class Assignment_2_6 {

	/* Problem 6. Write a java program to find the prime number from 1 to 100 and print them.*/
	
	public static void main(String[] args) {
		primeNumber();
	}
	
	public static void primeNumber(){
		int upperbound = 100;
		for (int number = 2; number <= upperbound; ++number) {

			int maxFactor = (int) Math.sqrt(number);
			boolean isPrime = true;
			int factor = 2;
			while (isPrime && factor <= maxFactor) {
				if (number % factor == 0) {
					isPrime = false;
				}
				++factor;
			}

			if (isPrime)
				System.out.println(number + " is a prime");
		}
	}
}
