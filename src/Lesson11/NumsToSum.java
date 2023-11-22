package Lesson11;

import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.Scanner;

public class NumsToSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = null;
        try {
            //in = new BufferedReader(new FileReader("C:/Users/30160735/J68V47-Classwork/src/Lesson11/NumsToBeSummed.txt"));
            in = new Scanner( new FileReader("C:/Users/30160735/J68V47-Classwork/src/Lesson11/NumsToBeSummed.txt"));
            int total = 0;
            while (in.hasNextLine()) {
                total += Integer.parseInt(in.nextLine());
            }
            System.out.println("The total of the file's numbers is: " + total + "!");
        } catch (IOException e) {
            System.out.println("Error occurred reading from file: " + e.toString());
        }
    }
}
