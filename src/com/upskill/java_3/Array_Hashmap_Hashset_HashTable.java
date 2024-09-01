package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {

		//Array store multiple data using index
		
		int age = 30;												//Variable
		
		int[] ageStarLord = new int[]{25, 30, 28, 32, 35, 27};		//Array
		
		//Array index				  [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageStarLord[0]);
		System.out.println("Total Student : " + ageStarLord.length);
		
		String[] nameStarLord = new String[]{"Ahsan", "Arobi", "Elena", "Eshana", "Sani", "Pavel"};
		
		System.out.println("Student Name : " + nameStarLord[1]);
		System.out.println("Total Student Name: " + nameStarLord.length);
		
		//Multi-Dimentional Array
		int [][] ageStarLord2D = {{25, 30, 28, 32, 35, 27},		//[0][0] [0][1] [0][2] [0][3] [0][4] [0][5]
								  {26, 29, 30, 34}};			//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2d : " + ageStarLord2D[0][4]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface, Allows one null key and multiple null values
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Ahsan", 26);
		Student.put("Arovi", 21);
		Student.put("Elena", 21);
		Student.put("Eshana", 24);
		Student.put("Sani", 19);
		Student.put("Pavel", 23);
		
		System.out.println("Hashmap Student Age : " + Student.get("Arovi"));
			
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washinton DC");
		Capital.put(null, "null key value");
		Capital.put(null, null);
		
		System.out.println("Capital City : " + Capital.get(null));
		
		//HashTable store multiple data using key-value pair, Does not allow null keys or null values, also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("BD", "Asia");
		Region.put("USA", "America");
//		Region.put(null, "null key value");
//		Region.put(null, null);
		
		System.out.println("Region : " + Region.get("BD"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Audi");
		car.add("Ford");
		
		System.out.println("Car : " + car);
	}
}