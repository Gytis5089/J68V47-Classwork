package Lesson3;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Cost (£):");
        Integer cost = input.nextInt();
        System.out.println("Interest Rate (%):");
        Integer interest = input.nextInt();
        System.out.println("Years:");
        Integer years = input.nextInt();

        // calculations
        // M = L( j / (1 - (1+j)^-n ) )
        Integer L = cost;
        Integer j = (interest / 100) / 12;
        Integer n = years * 12;
        // Code not worky (am silly) ((no literally, I have no clue what I'm doing))
        Double monthly = L * (j / (1 - Math.pow(1+j, -n)));

        // outputs
        System.out.println("\nThis Loan Will Cost £" + monthly + "/Month");
    }
}
