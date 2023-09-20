package Lesson4;

import java.util.Scanner;

public class PopQuiz2 {
    public static void main(String[] args) {
        // setup
        Scanner input = new Scanner(System.in);

        // code
        System.out.println("Q1. What is the capital of Spain? ");
        String ans1 = input.nextLine();
        if (!ans1.equalsIgnoreCase("madrid")) {
            System.out.println("Sorry, the correct answer is Madrid.");
        }
        System.out.println("Q1. What is the capital of the UK? ");
        String ans2 = input.nextLine();
        if (!ans2.equalsIgnoreCase("london")) {
            System.out.println("Sorry, the correct answer is London.");
        }
        System.out.println("Q1. What is the capital of Italy? ");
        String ans3 = input.nextLine();
        if (!ans3.equalsIgnoreCase("rome")) {
            System.out.println("Sorry, the correct answer is Rome.");
        }
    }
}
