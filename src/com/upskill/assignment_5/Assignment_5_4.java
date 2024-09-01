package com.upskill.assignment_5;

import java.util.Scanner;

public class Assignment_5_4 {
	
	/*	 The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with his generals.
	 *   Each letter is replaced by another letter N positions down the english alphabet. For example, for a rotation of 5,
	 *   the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
	 *   Implement a decoder for the Ceasar cipher where N = 5.
	 *   TIP: Use code.toCharArray() to get an array of characters. */


	public static void main(String[] args) {

		 String str_message, encrypted_Message = "";
		    int key;
		    char ch;
		    Scanner scan = new Scanner(System.in);
		    
		    System.out.println("Enter a message to encrypt: ");
		    str_message = scan.nextLine();
		    
		    System.out.println("Enter the key: ");
		    key = scan.nextInt();
		 
		    for(int i = 0; i < str_message.length(); ++i){
		      ch = str_message.charAt(i);						//talentech-> a -> e
		      
		      if(ch >= 'a' && ch <= 'z'){				//y
		              ch = (char)(ch + key);			//z?
		              
		              if(ch > 'z'){	
		                  ch = (char)(ch - 'z' + 'a' - 1);		//d
		              }
		              
		              encrypted_Message += ch;
		          }
		          else if(ch >= 'A' && ch <= 'Z'){
		              ch = (char)(ch + key);
		              
		              if(ch > 'Z'){
		                  ch = (char)(ch - 'Z' + 'A' - 1);
		              }
		              
		              encrypted_Message += ch;
		          }
		          else {
		          	encrypted_Message += ch;
		          }
		    }
		    
		    System.out.println("Encrypted Message is : = " + encrypted_Message);
	}
}
