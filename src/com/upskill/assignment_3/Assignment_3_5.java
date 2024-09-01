package com.upskill.assignment_3;

public class Assignment_3_5 {

	/* Problem 5. Dingdong program : Write a Java program that prints the numbers from 1 to 50.  
	 * But for multiples of three prints "Ding" instead of the number and for the multiples of five prints "Dong". 
	 * For numbers which are multiples of both three and five print "Dingdong" */


		public static void main(String[] args) {
			for (int i=1;i<=50;i++)
				if (i%3==0&&i%5==0){							// X%Y = 15/3=0 reminder
					System.out.println("DingDong");
				}else if (i%3==0){
					System.out.println("Ding");
				}else if (i%5==0){
					System.out.println("Dong");
				}
				else
					System.out.println(i);
		}
}
