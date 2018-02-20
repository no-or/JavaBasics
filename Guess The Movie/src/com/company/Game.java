package com.company;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Game {
    //Fields
    private int NameLen;

    /* Random random = new Random(); */
    File file = new File("movies.txt");
    Scanner scanner;

    //Get the movie name from the file
    String getMovieName() {
        int i = 0;
        String movieName = null;
        Random random = new Random();
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        while (i < random.nextInt(25)) {
            movieName = scanner.nextLine();
            i++;
        }
        return movieName;
    }

    /* put gaps with string length */
    char[] fillUpGaps(String movieName) {
        int i = 0;
        char[] chars = new char[movieName.length()];
        while (i != movieName.length()) {
            chars[i] = '_';
            i++;
        }
        return chars;
    }



    char[] isCorrect(String movie, char[] fillUp, String c) {
        //char[] fillUp = fillUpGaps(movie);
        char[] movieChar = movie.toCharArray();
        char[] replace = c.toCharArray();
        boolean yes = false;

        for(int i = 0; i < movie.length(); i++) {
            if(movieChar[i] == replace[0]) {
                fillUp[i] = replace[0];
                yes = true;
            }
        }
        return fillUp;
    }

   /* boolean hasWon() {

    }*/
}