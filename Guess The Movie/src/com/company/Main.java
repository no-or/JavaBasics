package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int chances = 10;
        String movieName;
        String userInput;
        Game myGame = new Game();
        Scanner scan = new Scanner(System.in);

        movieName = myGame.getMovieName();
        char[] chars = myGame.fillUpGaps(movieName);

        System.out.println(movieName);
        System.out.println(chars);
        System.out.println("The movie is " + movieName.length() + " characters long (includeing spaces)!");
        System.out.println("You have to guess a letter of the movie. You can go wrong 10 times max");

        System.out.print("Enter your guess: ");
        userInput = scan.nextLine();
        char[] replace = myGame.isCorrect(movieName, chars, userInput);
        System.out.println(replace);

        while (chances > 0) {

            if (replace) {
                System.out.println("Yass ! You have got it right ! Please try the next letter. You have " + chances + " chances left");
            } else {
                chances--;
                System.out.println("Oops ! The letter is not correct. Please try again. You have " + chances + " chances left");
            }
        }
        System.out.println("Game Over! Wanna play again ?");
    }
}