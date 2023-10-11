package Lesson7;

import java.util.Scanner;
import java.util.Random;

public class MightyMathsQuiz {

    public static int askQuestion(int num1, int num2, int op) {
        Scanner input = new Scanner(System.in);
        String opStr = "";
        if (op == 0) {
            opStr = "+";
        } else if (op == 1) {
            opStr = "-";
        } else {
            opStr = "*";
        }
        System.out.println("What is " + num1 + " " + opStr + " " + num2 + " = ");
        return input.nextInt();
    }

    public static int getAns(int num1, int num2, int op) {
        int ans = 0;
        if (op == 0) {
            ans = num1 + num2;
        } else if (op == 1) {
            ans = num1 - num2;
        } else {
            ans = num1 * num2;
        }
        return ans;
    }

    public static boolean checkAns(int ans, int userAns) {
        return userAns == ans;
    }

    public static int right(int amRight) {
        System.out.println("Correct!");
        return amRight += 1;
    }

    public static int wrong(int ans, int amWrong) {
        amWrong += 1;
        System.out.println("Wrong, the correct answer is: " + ans);
        System.out.println((3 - amWrong) + " Live(s) remaining");
        return amWrong;
    }

    public static int over() {
        return 10;
    }

    public static void stats(int amRight, int amWrong) {
        System.out.println(amRight + " Right");
        System.out.println(amWrong + " Wrong");
        if (amWrong == 0) {
            System.out.println("Well done!");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int amRight = 0;
        int amWrong = 0; // lives

        for (int count = 10; count >= 1; count--) {
            //code here (if you somehow didn't know???)

        }

        for (int count = 10; count >= 1; count--) {
            if (amWrong < 3) {
                int num1 = rand.nextInt(11);
                int num2 = rand.nextInt(11);
                int op = rand.nextInt(2);
                int userAns = askQuestion(num1, num2, op);
                int ans = getAns(num1, num2, op);
                boolean corr = checkAns(ans, userAns);
                if (corr == true) {
                    amRight = right(amRight);
                } else {
                    amWrong = wrong(ans, amWrong);
                }
            } else {
                count = over();
            }
        }
        stats(amRight, amWrong);
    }
}
