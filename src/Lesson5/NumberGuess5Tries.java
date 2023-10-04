package Lesson5;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess5Tries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(11);
        boolean guessed = false;

        for (int count = 0; count <= 5; count++) {
            System.out.println("Guess:");
            int guess = input.nextInt();
            if (guess != num) {
                if (guess < num) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }
            } else {
                count = 6;
                guessed = true;
            }
        }
        if (guessed == true) {
            System.out.println("You got it right, congrats!");
        } else {
            System.out.println("Sadly you didn't get it right, better luck next time");
        }
    }
}
