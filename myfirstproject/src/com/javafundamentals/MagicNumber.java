package com.javafundamentals;


import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;

        while (temp > 9) {

            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }

            temp = sum;
        }

        if (temp == 1) {
            System.out.println(num + " is a Magic Number");
        } else {
            System.out.println(num + " is not a Magic Number");
        }

        sc.close();
    }
}


