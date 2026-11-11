package com.javafundamentals;

public class MethodPractice2 {
	
	void displayNumber(int a) {
	    System.out.println(a);
	}

	void addNumbers(int a, int b) {
	    System.out.println(a + b);
	}

	void subtractNumbers(int a, int b) {
	    System.out.println(a - b);
	}

	void multiplyNumbers(int a, int b) {
	    System.out.println(a * b);
	}

	void divideNumbers(double a, double b) {
	    System.out.println(a / b);
	}

	void displayName(String name) {
	    System.out.println(name);
	}

	void displayAge(int age) {
	    System.out.println(age);
	}

	void greet(String name) {
	    System.out.println("Hello " + name);
	}

	void calculateSquare(int n) {
	    System.out.println(n * n);
	}

	void calculateCube(int n) {
	    System.out.println(n * n * n);
	}

	void checkEvenOdd(int n) {
	    System.out.println(n % 2 == 0 ? "Even" : "Odd");
	}

	void checkPositiveNegative(int n) {
	    System.out.println(n >= 0 ? "Non-negative" : "Negative");
	}

	void printTable(int n) {
	    for (int i = 1; i <= 10; i++) {
	        System.out.println(n + " x " + i + " = " + (n * i));
	    }
	}

	void displayEmployee(String name, double salary) {
	    System.out.println(name + " " + salary);
	}

	void calculateSimpleInterest(double p, double t, double r) {
	    System.out.println(p * t * r / 100);
	}

	public static void main(String[] args) {


		    MethodPractice2 obj = new MethodPractice2();

		    obj.displayNumber(10);

		    obj.addNumbers(20, 10);

		    obj.subtractNumbers(20, 10);

		    obj.multiplyNumbers(5, 4);

		    obj.divideNumbers(20, 4);

		    obj.displayName("Sindhu");

		    obj.displayAge(22);

		    obj.greet("Sindhu");

		    obj.calculateSquare(5);

		    obj.calculateCube(3);

		    obj.checkEvenOdd(8);

		    obj.checkPositiveNegative(-5);

		    obj.printTable(5);

		    obj.displayEmployee("Sindhu", 25000);

		    obj.calculateSimpleInterest(100000, 2, 8);
		}

	}


