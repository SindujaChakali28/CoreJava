
package com.javafundamentals;

import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
            return;
        }

        if (age < 18) {
            System.out.println("Not eligible to vote");
            return;
        }

        System.out.println("Enter your citizenship (true/false):");
        boolean indianCitizen = sc.nextBoolean();

        if (!indianCitizen) {
            System.out.println("Not eligible to vote");
            return;
        }

        System.out.println("Enter your voter ID (true/false):");
        boolean hasVoterId = sc.nextBoolean();

        if (!hasVoterId) {
            System.out.println("Voter ID required");
            return;
        }

        System.out.println("Eligible to vote");

        sc.close();
    }
}

