package com.upskill.java_6;

public class MutiThreading {
	
	/* Multithreading is a Java feature that allows 
	  concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */
	
	public static void main(String[] args) {
		 int n = 10;
		 for (int i = 0; i < n ; i++){
			 MutithreadingThread obj = new MutithreadingThread();
			 obj.start();
			 
			 Thread obj2 = new Thread(new MutithreadingRunable());
			 obj2.start();
		 }
	}
}