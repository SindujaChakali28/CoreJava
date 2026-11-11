package com.javafundamentals;


import java.util.Scanner;
import java.util.Random;

public class GuessNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        int guess;
        int chances = 1;

        System.out.println("RANDOM NUMBER GUESSING GAME");
        System.out.println("Guess a number between 1 and 10");
        System.out.println("You have only 3 chances!");

        do {
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

            chances++;

        } while (chances <= 3);

        if (guess != randomNumber) {
            System.out.println("Game Over!");
            System.out.println("The correct number is: " + randomNumber);
        }

        sc.close();
    }
}

