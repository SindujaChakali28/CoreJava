package com.javafundamentals;

import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int divisor = (int) Math.pow(10, count);

        if (square % divisor == num) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }

        sc.close();
    }
}



