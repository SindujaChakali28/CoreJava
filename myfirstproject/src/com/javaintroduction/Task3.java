package com.javaintroduction;

public class Task3 {
	int rollno=1;
	int marks=100;
	String name="Sindhuja";
	static {
		System.out.println("ASIT");
	}
	{
		System.out.println("Student Object created");
	}
	
	void studentDisplay() {
		System.out.println("Student name:" +name);
		System.out.println("Student marks:"+marks);
		System.out.println("Student rollno:"+rollno);
		
	}
	static void display() {
		System.out.println("college id:2h");
		
	}
	public static void main(String[] args) {
		Task3 t1=new Task3();
		Task3 t2=new Task3();
		t1.studentDisplay();
		display();
		t2.studentDisplay();
		display();
		
		
	}

}
