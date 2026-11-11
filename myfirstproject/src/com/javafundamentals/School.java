package com.javafundamentals;

public class School {
	String name ="Nashii School";
	String location="Nellore";
	int admissionyear=2026;
	double fee=200024;
	

	public static void main(String[] args) {
		School s=new School();
		s.display();

	}
	void display() {
		System.out.println("School Name:"+name);
		System.out.println("School Location:"+location);
		System.out.println("AdmissionYear:"+admissionyear);
		System.out.println("School fee:"+fee);
		
		
	}

}
