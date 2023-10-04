package Lesson5;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Base number:");

        int number = input.nextInt();

        for (int count = 0; count <= 12; count++) {
            System.out.println(number + " * " + count + " = " + number * count);
        }
    }
}
