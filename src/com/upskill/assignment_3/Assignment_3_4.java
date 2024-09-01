package com.upskill.assignment_3;

public class Assignment_3_4 {

	/* Problem 4.	Write a java program that explains runtime polymorphism. */


		public static void main(String[] args) {
		
			Assignment_3_4 v1=new Assignment_3_4();
			v1.wheels();
			System.out.println("Run-Time PolyMorphism ->");
			Assignment_3_4 v2=new Truck();
			v2.wheels();
			Assignment_3_4 v3=new Car();
			v3.wheels();
			Assignment_3_4 v4=new Bike();
			v4.wheels();
			Assignment_3_4 v5=new BiCycle(); //BiCycle doesn't have wheel class so its upper class method is invoked!
			v5.wheels();
		}
		
		void wheels(){
			System.out.println("Every Vehicle have some wheels!");
		}
	}

	class Truck extends Assignment_3_4{
		void wheels(){
			System.out.println("Trucks have 6 wheels!");
		}
	}

	class Car extends Assignment_3_4{
		void wheels(){
			System.out.println("Cars have 4 wheels!");
		}
	}

	class Bike extends Assignment_3_4{
		void wheels(){
			System.out.println("Bikes have 2 wheels!");
		}
	}

	class BiCycle extends Bike{
		
	}
