package Lesson7;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MightyMenu {

    public static void optionHandler(int choice) {
        if (choice == 1) {
            System.out.println("\nhello\n");
        } else if (choice == 2) {
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            Date date = new Date();
            System.out.println("\n" + formatter.format(date) + "\n");
        } else if (choice == 3) {
            System.out.println("\nyou\n");
        } else if (choice != 4) {
            System.out.println("\nIncorrect value\n");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 1;

        while (choice != 4) {
            System.out.println("1 - Say \"hello\"\n2 - Say the time\n3 - Say a joke\n4 - Quit\n");

            choice = input.nextInt();

            optionHandler(choice);
        }

    }
}
