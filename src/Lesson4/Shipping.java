package Lesson4;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        // setup
        Scanner input = new Scanner(System.in);

        // inputs
        System.out.println("Total Price:£");
        Double price = input.nextDouble();

        // outputs
        if (price < 50) {
            System.out.println("Shipping Cost:£10");
            price += 10;
        } else {
            System.out.println("Free Shipping!");
        }
        System.out.println("Total Cost:£" + price);
    }
}
