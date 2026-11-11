package com.javafundamentals;

public class MethodPractice4 {
	
	int add(int a, int b) {
	    return a + b;
	}

	int subtract(int a, int b) {
	    return a - b;
	}

	int multiply(int a, int b) {
	    return a * b;
	}

	double divide(double a, double b) {
	    return a / b;
	}

	int square(int n) {
	    return n * n;
	}

	int cube(int n) {
	    return n * n * n;
	}

	int remainder(int a, int b) {
	    return a % b;
	}

	int maximum(int a, int b) {
	    return a > b ? a : b;
	}

	int minimum(int a, int b) {
	    return a < b ? a : b;
	}

	boolean isEven(int n) {
	    return n % 2 == 0;
	}

	boolean isOdd(int n) {
	    return n % 2 != 0;
	}

	boolean isPositive(int n) {
	    return n > 0;
	}

	int factorial(int n) {
	    int fact = 1;
	    for (int i = 1; i <= n; i++) {
	        fact *= i;
	    }
	    return fact;
	}

	int sumToN(int n) {
	    return n * (n + 1) / 2;
	}

	double simpleInterest(double p, double t, double r) {
	    return p * t * r / 100;
	}

	double totalLoanAmount(double p, double interest) {
	    return p + interest;
	}

	double monthlyEMI(double total, int years) {
	    return total / (years * 12);
	}

	double percentage(double marks, double total) {
	    return marks / total * 100;
	}

	int absoluteValue(int n) {
	    return n < 0 ? -n : n;
	}

	int lastDigit(int n) {
	    return Math.abs(n % 10);
	}

	public static void main(String[] args) {



    MethodPractice4 obj = new MethodPractice4();

    System.out.println("Addition: " + obj.add(10, 5));

    System.out.println("Subtraction: " + obj.subtract(10, 5));

    System.out.println("Multiplication: " + obj.multiply(10, 5));

    System.out.println("Division: " + obj.divide(20, 4));

    System.out.println("Square: " + obj.square(5));

    System.out.println("Cube: " + obj.cube(3));

    System.out.println("Remainder: " + obj.remainder(10, 3));

    System.out.println("Maximum: " + obj.maximum(10, 20));

    System.out.println("Minimum: " + obj.minimum(10, 20));

    System.out.println("Is Even: " + obj.isEven(8));

    System.out.println("Is Odd: " + obj.isOdd(7));

    System.out.println("Is Positive: " + obj.isPositive(5));

    System.out.println("Factorial: " + obj.factorial(5));

    System.out.println("Sum from 1 to N: " + obj.sumToN(10));

    System.out.println("Simple Interest: " +
                       obj.simpleInterest(100000, 2, 8));

    System.out.println("Total Loan Amount: " +
                       obj.totalLoanAmount(100000, 16000));

    System.out.println("Monthly EMI: " +
                       obj.monthlyEMI(116000, 2));

    System.out.println("Percentage: " + obj.percentage(450, 500));

    System.out.println("Absolute Value: " + obj.absoluteValue(-25));

    System.out.println("Last Digit: " + obj.lastDigit(1234));


	}

}
