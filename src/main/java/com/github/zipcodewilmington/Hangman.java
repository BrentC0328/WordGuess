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
    static String[] theGuessWords = new String[]{"Siren", "Plain", "Style", "Scowl", "Debut", "Least", "Flask"};


    public static void run() {
        Boolean play;
        String playAgain = "";


        do {
            play = true;
            StringBuilder emptyWord = new StringBuilder(); // Empty string for style. Works.
            emptyWord.append("_____");
            Integer randomNumber = random.nextInt(7); // generates random number to use for array. Works.
            String theHiddenWord = theGuessWords[randomNumber]; //uses random number to pick word from array. Works.
            String guess2 = "";
            String guess3 = "";
            boolean aWinner = false;

            Consoler.gameIntro(); // Works fine.
            System.out.println(theHiddenWord); //FOR TESTING, REMOVE AT END.

            System.out.println("\n" + emptyWord); // works fine

            String guess1 = Consoler.getGuess(); // works fine


            if (guess1.equalsIgnoreCase(theHiddenWord)) { // Works fine
                playAgain = Consoler.winAnswer();
                aWinner = true;
                if (playAgain.equalsIgnoreCase("n")) {
                    play = false;
                    break;
                }

            }
            if (!guess1.equalsIgnoreCase(theHiddenWord)) {
                for (int i = 0; i < theHiddenWord.length(); i++) {
                    char check1 = guess1.toLowerCase().charAt(i);
                    char check2 = theHiddenWord.toLowerCase().charAt(i);

                    if (check1 == check2) {                          //This whole loop check finally works.
                        emptyWord.setCharAt(i, check1);
                    }
                }
                System.out.println(emptyWord);

                System.out.println("Two more guesses");
                guess2 = Consoler.wrongAnswer2();


                if (guess2.equalsIgnoreCase(theHiddenWord)) {
                    playAgain = Consoler.winAnswer();
                    aWinner = true;
                    if (playAgain.equalsIgnoreCase("n")) {
                        play = false;
                        break;
                    }
                } else {
                    for (int i = 0; i < theHiddenWord.length(); i++) {
                        char check1 = guess2.toLowerCase().charAt(i);
                        char check2 = theHiddenWord.toLowerCase().charAt(i);

                        if (check1 == check2) {                          //This whole loop check finally works.
                            emptyWord.setCharAt(i, check1);
                        }
                    }
                    System.out.println(emptyWord + "\n");
                    System.out.println("One more guess");
                    guess3 = Consoler.wrongAnswer3();
                }


            if (!aWinner) {
                if (guess3.equalsIgnoreCase(theHiddenWord)) { // Works fine
                    playAgain = Consoler.winAnswer();
                } else { // Works fine
                    playAgain = Consoler.loserMessage();
                }
                if (playAgain.equalsIgnoreCase("n")) {
                    play = false;
                }
            }

            }
        }
            while (play) ;
        }
    }
