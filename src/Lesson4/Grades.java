package Lesson4;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Percentage:");
        int grade = input.nextInt();

        if (grade >= 70) {
            System.out.println("A");
        } else if (grade >= 60) {
            System.out.println("B");
        } else if (grade >= 50) {
            System.out.println("C");
        } else if (grade >= 40) {
            System.out.println("D");
        } else {
            System.out.println("No Award");
        }
    }
}
