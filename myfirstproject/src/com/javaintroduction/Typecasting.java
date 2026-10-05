package com.javaintroduction;

public class Typecasting {
	
	Integer StudentId=1;
	int marks=86;
	boolean status= true;
	int id1=StudentId;  //Auto Unboxing
	Boolean boo = status;//Auto Boxing
	
	public static void main(String[] args) {
		Typecasting t= new Typecasting();
		System.out.println(t.StudentId);
		System.out.println(t.marks);
		System.out.println(t.status);
		System.out.println(t.id1);
		System.out.println(t.boo);
		
		
		// TODO Auto-generated method stub

	}

}
