package com.javaintroduction;

public class Student2 {
	int a=256;
	double a1= 256;
	int a2=(int) a1;
	char c=76;
	int c1= c;

	public static void main(String[] args) {
		Student2 s =new Student2();
		System.out.println(s.a);
		System.out.println(s.a1);
		System.out.println(s.a2);
		System.out.println(s.c);
		System.out.println(s.c1);
	}

}
