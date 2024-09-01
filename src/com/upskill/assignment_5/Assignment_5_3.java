package com.upskill.assignment_5;

public class Assignment_5_3 {
	
	// A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
	// Write a method that detects if a string is a palindrome.

	
	public static void main(String[] args) {

		System.out.println(isPalindrome("ABCDCBA"));

	}
	
	public static boolean isPalindrome(String word) {
		
		//Pointers pointing to the beginning
		int i1 = 0;
		//and the end of the string
		int i2 = word.length() - 1;
		//While there are characters to compare
		while (i2 > i1) {
			//If there is a mismatch
		    if (word.charAt(i1) != word.charAt(i2)) {
		        return false;
		    }
		    //Increment first pointer and
		    //decrement the other
		    ++i1;
		    --i2;
		}
		//Given string is a palindrome
		return true;
		}

	
	
}
