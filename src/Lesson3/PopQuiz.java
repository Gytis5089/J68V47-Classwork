package Lesson3;

import java.util.Scanner;

public class PopQuiz  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pop Quiz Time!");

        System.out.println("\nWhat is the Capital of Spain? ");
        String ans1 = input.next();
        if (ans1.toLowerCase().equals("madrid")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("What is the Capital of Russia? ");
        String ans2 = input.next();
        if (ans1.toLowerCase().equals("moscow")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
        System.out.println("What is the Capital of China? ");
        String ans3 = input.next();
        if (ans1.toLowerCase().equals("beijing")) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}
