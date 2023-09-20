package Lesson4;

import java.util.Scanner;

public class Toaster {
    public static void main(String[] args) {
        // setup
        Scanner input = new Scanner(System.in);

        // info
        System.out.println("First Name:");
        String fName = input.nextLine();
        System.out.println("Last Name:");
        String lName = input.nextLine();
        System.out.println("Order Value:");
        Double value = input.nextDouble();
        System.out.println("Amount You Wish to Deposit:");
        Double deposit = input.nextDouble();

        // outputs
        System.out.println("Customer:" + fName.substring(0) + " " + lName);
        System.out.println("Order Total:£" + value);
        System.out.println("Deposit Paid:£" + deposit);
        System.out.format("Remainder:£%.2f\n", (value - deposit));
        if (value > 100) {
            System.out.println("You get a free toaster!");
        }
        System.out.println("Have a nice day");
    }
}
