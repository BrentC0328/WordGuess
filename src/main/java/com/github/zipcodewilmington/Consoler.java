package com.github.zipcodewilmington;

import java.util.Random;
import java.util.Scanner;

public class Consoler {

    public static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();




    public static String getGuess(){
        System.out.println("Guess the word");
        return scanner.nextLine();
    }

    public static String gameIntro(){
        System.out.println("Welcome to Hangman" + "\n" + "You will have 3 chances to guess a 5 letter word");
        System.out.println("Type any letter to begin");
        return scanner.nextLine();
    }


    public static String wrongAnswer(){
        String[] wrongResponses = new String[]{"Not quite, try again" , "Wrong-o", "Incorrect guess", "No", "You got it...sike"};
        int randomNum = random.nextInt(5) + 1;
        System.out.println(wrongResponses[randomNum]);
        System.out.println("next guess: ");
        return scanner.nextLine();
    }

    public static String winAnswer(){
        System.out.println("Fill in a fancy win message here!");
        System.out.println("Play again?");
        return scanner.nextLine();
    }









}
