package Lesson5;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number to end on:");
        int end = input.nextInt();

        for (int count = 1; count <= end; count++) {
            System.out.println(count * count);
        }
    }
}
