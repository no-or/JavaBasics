package com.company;

import java.util.Scanner;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        int words = 0;
        File file = new File("newBook.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("The number of total words is: " + words);
    }
}
