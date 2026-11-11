package com.javafundamentals;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num >= 0) ? "Positive Number" : "Negative Number";

        System.out.println(result);

        sc.close();


	}

}
