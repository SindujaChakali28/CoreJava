package com.javafundamentals;

public class Class_Account {

	

    // Instance variables
    int Accno;
    String name;
    double salary;

    // Static variable
    static int accountNoGenerater = 1000;

    // Instance Initializer Block
    {
        accountNoGenerater++;
        Accno = accountNoGenerater;
    }

    // Constructor
    Class_Account(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    void display() {
        System.out.println("Account Number: " + Accno);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Class_Account a1 = new Class_Account("Sinduja", 30000);
        Class_Account a2 = new Class_Account("Rahul", 40000);
        Class_Account a3 = new Class_Account("Priya", 50000);

        a1.display();
        a2.display();
        a3.display();
    }
	}


