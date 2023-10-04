package Lesson6;

import java.util.Scanner;
import java.util.Random;

public class MathQuizRemix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int right = 0;
        int wrong = 0; // lives

        for (int count = 10; count >= 1; count--) {
            if (wrong < 3) {
                int num1 = rand.nextInt(11);
                int num2 = rand.nextInt(11);
                int type = rand.nextInt(4);
                int answer = 0;
                if (type == 0) {
                    // add
                    System.out.println(num1 + " + " + num2 + " = ");
                    answer = num1 + num2;
                } else if (type == 1) {
                    // times
                    System.out.println(num1 + " * " + num2 + " = ");
                    answer = num1 * num2;
                /*
                } else if (type == 3) {
                    // divide (1/2)
                    System.out.println(num1 + " / " + num2 + " = ");
                    answer = num1 / num2;
                } else if (type == 4) {
                    // divide (2/1)
                    System.out.println(num2 + " / " + num1 + " = ");
                    answer = num2 / num1;
                */
                } else if (type == 2) {
                    // minus (1-2)
                    System.out.println(num1 + " - " + num2 + " = ");
                    answer = num1 - num2;
                } else {
                    // minus (2-1)
                    System.out.println(num2 + " - " + num1 + " = ");
                    answer = num2 - num1;
                }
                int userans = input.nextInt();
                if (userans == answer) {
                    System.out.println("Correct!");
                    right += 1;
                } else {
                    System.out.println("Wrong, the correct answer is: " + answer);
                    wrong += 1;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(right + " Right");
        System.out.println(wrong + " Wrong");
        if (wrong == 0) {
            System.out.println("Well done!");
        }
    }
}
