package com.javafundamentals;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int guess= random.nextInt(10+1);
		System.out.println(random);

        for (int i =1; i<=3; i++) {
        	
        	System.out.println("Enter your guess:(1-10)");
        	
        	
        }

		
		

	}

}
