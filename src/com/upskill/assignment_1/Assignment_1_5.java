package com.upskill.assignment_1;

public class Assignment_1_5 {

	/* Problem 05: Write a java program which will display name and guestimated age of every students in your class.
	(write separate method for every student). */

		public static void main(String[] args) {
			
			System.out.println("Age of Nayem is "+ ageNayem());
			System.out.println("Age of Hasan is "+ ageHasan());
			System.out.println("Age of Alamin is "+ ageAlamin());
		}
		
		public static int ageNayem(){
			return 25;
		}
		
		public static int ageHasan(){
			return 20;
		}

		public static int ageAlamin(){
			return 30;
		}
}