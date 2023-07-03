package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class Consoler {

    public static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();




    public static String getGuess(){
        System.out.println("Guess the word");
        String input = scanner.nextLine();
        return input;
    }

    public static String gameIntro(){
        System.out.println("Welcome to Hangman" + "\n" + "You will have 3 chances to guess a 5 letter word");
        System.out.println("Type any letter to begin");
        String input = scanner.nextLine();
        return input;
    }


    public static String wrongAnswer(){
        String[] wrongResponses = new String[]{"Not quite, try again" , "Wrong-o", "Incorrect guess", "No", "You got it...sike"};
        int randomNum = random.nextInt(5) + 1;
        System.out.println(wrongResponses[randomNum]);
        System.out.println("next guess: ");
        String input = scanner.nextLine();
        return input;
    }









}
