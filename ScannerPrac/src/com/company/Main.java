package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int chances = 9;
        Random rand = new Random();
        int guess = rand.nextInt(50) + 1;

        System.out.println("I have guessed a number between 1 to 50");
        System.out.println("You have 10 guesses to find it");
        System.out.println("Enter your 1st guess : ");

        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();

        while (chances > 0) {
            if (userGuess < guess) {
                System.out.println("Guess Higher. You have " + chances + " chances left");
                userGuess = scan.nextInt();
            }
            if (userGuess > guess) {
                System.out.println("Guess Lower. You have " + chances + " chances left");
                userGuess = scan.nextInt();
            }
            if (userGuess == guess) {
                System.out.println("Bravo ! You have got it");
                break;
            }
            chances--;
        }
    }
}
