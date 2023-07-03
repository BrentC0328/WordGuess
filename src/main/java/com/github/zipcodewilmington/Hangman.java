package com.github.zipcodewilmington;


import java.io.Console;
import java.util.Random;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

//Brent Cubbage

public class Hangman {
    static Random random = new Random();
    static String[] theGuessWords = new String[]{"Siren","Plain","Style","Scowl","Debut","Least","Flask"};




    public static void run() {

        String emptyWord = "_____"; // Empty string for style. Works.
        Integer randomNumber = random.nextInt(7) + 1; // generates random number to use for array. Works.
        String theHiddenWord = theGuessWords[randomNumber]; //uses random number to pick word from array. Works.

        Consoler.gameIntro(); // Works fine.

        System.out.println("\n" + emptyWord); // works fine

        String guess1 = Consoler.getGuess(); // works fine

        if (guess1.equalsIgnoreCase(theHiddenWord)){
            Consoler.winScreen();
        } else {





    }
}
