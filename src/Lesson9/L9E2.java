package Lesson9;
import java.util.*;
import java.io.File;

public class L9E2 {

    public static void exception1() {
        // exception 1
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // exception 2
        try {
            int exception2 = Integer.MAX_VALUE + 1;
            System.out.println(exception2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception3() {
        // exception 3
        try {
            int[] myArray3 = new int[5];
            int exception3 = myArray3[5];
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception4() {
        // exception 4
        try {
            int[] myArray4 = null;
            int exception4 = myArray4[0];
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception5() {
        // exception 5
        try {
            File exception5 = new File("exception5.txt");
            Scanner scanner = new Scanner(exception5);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception6() {
        // exception 6
        try {
            String thisString = "Hello";
            int exception6 = Integer.parseInt(thisString);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception7() {
        // exception 7
        try {
            String exception7 = null;
            System.out.println(exception7.toUpperCase());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        exception1();
        // Division by 0
        exception2();
        // Passing the integer limit
        exception3();
        // Going past the length of an array
        exception4();
        // Trying to get a value from an empty array
        exception5();
        // Invalid file path
        exception6();
        // Trying to cast a string into an integer
        exception7();
        // Trying to turn a null object into an uppercase string
    }
}