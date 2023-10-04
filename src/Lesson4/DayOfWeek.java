package Lesson4;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Which day number would you like the name of?");
        int daynum = input.nextInt();

        if (daynum == 1) {
            System.out.println("Monday");
        } else if (daynum == 2) {
            System.out.println("Tuesday");
        } else if (daynum == 3) {
            System.out.println("Wednesday");
        } else if (daynum == 4) {
            System.out.println("Thursday");
        } else if (daynum == 5) {
            System.out.println("Friday");
        } else if (daynum == 6) {
            System.out.println("Saturday");
        } else if (daynum == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid day number");
        }
    }
}
