package com.javafundamentals;

import java.util.Scanner;

public class SwitchDemo {

	    void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int a = sc.nextInt();
		System.out.println("enter b:");
		int b = sc.nextInt();
		System.out.println("enter op:");
		int op=sc.nextInt();
		switch(op) {
		case 1 -> add(a,b);
		case 2 -> sub(a,b);
		case 3 -> multiply(a,b);
		
		}


	}
	
 int add(int a,int b) {
	 int sum =a+b;
		System.out.println(sum);
		return sum;
	}
 int sub(int a,int b) {
	 int sub=a-b;
	 System.out.println(sub);
		return sub;
	}
 int multiply(int a,int b) {
	 int multiply = a*b;
	 System.out.println(multiply);
		return multiply;
	}
 int division(int a,int b) {
	 int division = a/b;
	 System.out.println(division);
		return division;
	}

}
