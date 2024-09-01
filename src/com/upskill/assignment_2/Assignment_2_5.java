package com.upskill.assignment_2;

public class Assignment_2_5 {

	/* Problem5. Write a program in Java to display the multiplication table upto (eight)8.*/
	
	public static void main(String[] args) {
		
		multipicationTable();
	}

	public static void multipicationTable() {
	
		for (int row = 1; row <= 8; row++) {
			for (int col = 1; col <= 10; col++) {
				int MultiplicationTable = row * col;
				System.out.print(MultiplicationTable + " ");
			}
			System.out.println("");
		}
	}
}
