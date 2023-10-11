package Lesson7;

import java.util.Scanner;

public class SumFunction {

    public static int adder(int uno, int dos) {
        return uno + dos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First number:");
        int numUn = input.nextInt();
        System.out.println("Second number:");
        int numDos= input.nextInt();

        int theSum = adder(numUn, numDos);

        System.out.println("The sum of " + numUn + " and " + numDos + " is " + theSum);

    }
}
