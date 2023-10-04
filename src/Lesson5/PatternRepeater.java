package Lesson5;

import java.util.Scanner;

public class PatternRepeater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pattern = input.next();

        for (int count = 0; count <= 10; count++) {
            System.out.print(pattern);
        }
    }
}
