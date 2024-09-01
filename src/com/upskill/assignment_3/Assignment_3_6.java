package com.upskill.assignment_3;

public class Assignment_3_6 {

	
	/* Problem 6.	Write a java program which will count the number of vowels,
	 *  consonants, digits, tabs and blank spaces 
	 * from a string “A quick brown fox jumps over the lazy dog”. */


		public static void main(String[] args) {
			int vowelcount = 0;
			int constcount = 0;
			int digitcount = 0;
			int tabcount = 0;
			int spacecount = 0;
			char s = '\0';
			String str = "A quick brown fox jumps over the lazy dog";
			for (int i = 0; i < str.length(); i++) {
				s = str.charAt(i);
				if (Character.toString(s).toLowerCase().matches("[aeiou]") == true) {
					vowelcount++;} 
				else if (Character.toString(s).toLowerCase().matches("\\d") == true) {
					digitcount++;} 
				else if (Character.toString(s).toLowerCase().matches("\\t") == true) {
					tabcount++;} 
				else if (Character.toString(s).toLowerCase().matches("\\s") == true) {
					spacecount++;} 
				else
					constcount++;
			}
			System.out.println("Number of Vowels: " + vowelcount);
			System.out.println("Number of Constants: " + constcount);
			System.out.println("Number of Digits: " + digitcount);
			System.out.println("Number of Tabs: " + tabcount);
			System.out.println("Number of Whitespaces: " + spacecount);
		}
	}

