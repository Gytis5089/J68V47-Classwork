package Lesson11;

import java.io.*;
import java.util.Scanner;

public class NumberTimesTabletoFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Times Table:");
        int table = input.nextInt();

        FileWriter out = null;
        try {
            out = new FileWriter("C:/Users/30160735/J68V47-Classwork/src/Lesson11/TableFile.txt");
            for (int i = 1; i <= 12; i++) {
                out.write(i + " x " + table + " = " + (i * table));
                if (i <= 11) {
                    out.write("\n");
                }
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Error occurred writing to file: " + e.toString());
        }

        System.out.println("Done!");
    }
}
