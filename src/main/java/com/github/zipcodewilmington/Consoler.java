package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class Consoler {

    public static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    public static String getGuess() {
        System.out.println("Guess the word");
        return scanner.nextLine();
    }

    public static String gameIntro() {
        System.out.println("Welcome to Hangman" + "\n" + "You will have 3 chances to guess a 5 letter word");
        System.out.println("Type any letter to begin");
        return scanner.nextLine();
    }


    public static String wrongAnswer() {
        String[] wrongResponses = new String[]{"Not quite, try again", "Wrong-o", "Incorrect guess", "No", "You got it...sike"};
        int randomNum = random.nextInt(5);
        System.out.println(wrongResponses[randomNum]);
        System.out.println("next guess: ");
        return scanner.nextLine();
    }

    public static String winAnswer() {
        System.out.println("Winner (insert some cool winner art");
        System.out.println("Play again?");
        return scanner.nextLine();
    }

    public static String loserMessage() {
        System.out.println("You lose. \n" +
                "888                                \n" +
                "888                                \n" +
                "888                                \n" +
                "888 .d88b. .d8888b  .d88b. 888d888 \n" +
                "888d88\"\"88b88K     d8P  Y8b888P\"   \n" +
                "888888  888\"Y8888b.88888888888     \n" +
                "888Y88..88P     X88Y8b.    888     \n" +
                "888 \"Y88P\"  88888P' \"Y8888 888     \n");
        System.out.println("Play again?");
        return scanner.nextLine();
    }


}
