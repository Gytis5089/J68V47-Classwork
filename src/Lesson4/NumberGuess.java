package Lesson4;

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(11);

        int guess = 11;

        while (guess != number) {
            System.out.println("Guess:");
            guess = input.nextInt();
            if (guess < number) {
                System.out.println("Higher");
            } else if (guess > number) {
                System.out.println("Lower");
            }
        }
        System.out.println("Correct!");
    }
}
