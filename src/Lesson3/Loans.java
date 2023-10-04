package Lesson3;

import java.util.Scanner;

public class Loans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Cost (£):");
        int cost = input.nextInt();
        System.out.println("Interest Rate (%):");
        int interest = input.nextInt();
        System.out.println("Years:");
        int years = input.nextInt();

        // calculations
        // M = L( j / (1 - (1+j)^-n ) )
        int L = cost;
        float j = ((float)interest / 100) / 12;
        int n = years * 12;
        System.out.format("%d %.6f %d",L, j, n);
        // Code not worky (am silly) ((no literally, I have no clue what I'm doing))
        double monthly = L * (j / (1 - Math.pow(1+j, -n)));

        // outputs
        System.out.println("\nThis Loan Will Cost £" + monthly + "/Month");
    }
}
