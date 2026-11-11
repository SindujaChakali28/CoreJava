package com.javafundamentals;

import java.util.Scanner;

public class POC1 {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Name: ");
			String name = sc.nextLine();
			System.out.println("Hello " + name);
			System.out.println("Enter your passedout year ");
			int passedOutYear = sc.nextInt();
			System.out.println("Enter your Qualification");
			String qualification = sc.next();
			if (qualification.equalsIgnoreCase("Btech")) {
			}
			else {
				System.out.println("Not eligible");
				return;
			}
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			System.out.println("Enter your cgpa: ");
			double cgpa = sc.nextDouble();
			
			if (age >= 18  &&  cgpa >= 8.0 && passedOutYear == 2026) {
				  System.out.println("You are eligible");
				  System.out.println("you can apply for the job role");
				 
				  
				  
			} else {
				System.out.println("You are not meeting the required criteria");
			}
			

		}

	}


