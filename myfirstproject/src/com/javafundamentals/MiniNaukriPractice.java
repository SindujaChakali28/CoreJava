package com.javafundamentals;


import java.util.Scanner;

public class MiniNaukriPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("MINI NAUKRI JOB PORTAL ");

        System.out.print("Enter candidate name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter qualification: ");
        String qualification = sc.nextLine();

        System.out.print("Do you know Java (true/false): ");
        boolean javaSkill = sc.nextBoolean();

        System.out.print("Do you know SQL (true/false): ");
        boolean sqlSkill = sc.nextBoolean();

        System.out.print("Do you have communication skills (true/false): ");
        boolean communication = sc.nextBoolean();

        System.out.print("Enter aptitude score: ");
        int aptitude = sc.nextInt();

        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();

        System.out.print("Enter expected salary in LPA: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter preferred role: ");
        String role = sc.nextLine();

        System.out.println("\nCANDIDATE REPORT");
        System.out.println("Name: " + name);




        sc.close();
    }
}

