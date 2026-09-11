package com.javaintroduction;



	
		public class Student {

		    
		    static String collegeName = "MGIT College";

		    
		    String studentName;
		    int studentId;
		    double studentMarks;

		    public static void main(String[] args) {

		        
		        Student student1 = new Student();

		        
		        student1.studentName = "Sindhu";
		        student1.studentId = 1;
		        student1.studentMarks = 85.5; 

		       
		        System.out.println("College Name: " + collegeName);
		        System.out.println("Student Name: " + student1.studentName);
		        System.out.println("Student ID: " + student1.studentId);
		        System.out.println("Student Marks: " + student1.studentMarks);
		    }
		

	}


