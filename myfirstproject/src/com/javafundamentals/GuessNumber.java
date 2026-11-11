package com.javafundamentals;


import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int guess;

        System.out.println("RANDOM NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1 and 10");
        System.out.println("You have only 3 chances!");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                break;
            }
            else if (guess < randomNumber) {
                System.out.println("Too Low! Try Again.");
            }
            else {
                System.out.println("Too High! Try Again.");
            }

            if (i == 3) {
                System.out.println("Game Over!");
                System.out.println("The correct number is: " + randomNumber);
            }
        }

        sc.close();
    }
}