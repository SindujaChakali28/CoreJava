package com.javaintroduction;

public class Task {
	
	String StudentName;
	int Rollno;
	String Course;
	int javaMarks;
	int sqlMarks;
	int pythonMarks;
	int total;
	int average;
	
	void displayStudentDetails() {
		System.out.println("Student Name:"+StudentName);
		System.out.println("Student Rollno:"+Rollno);
		System.out.println("Student Course:"+Course);
		
	}
	void CalculateTotal() {
	     total=javaMarks+sqlMarks+pythonMarks;
	     System.out.println(total);
		

	}
	
	void average() {
		average= total/3;
		System.out.println(average);
	}

	public static void main(String[] args) {
		Task t=new Task();
		t.StudentName="Sindhuja";
		t.Rollno=1;
		t.Course="Java";
		t.javaMarks=6;
		t.sqlMarks=7;
		t.pythonMarks=8;
		t.displayStudentDetails();
		t.CalculateTotal();
		t.average();
		
		
		
         
	}

}
