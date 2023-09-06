import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1:");
        Integer num1 = input.nextInt();

        System.out.print("Number 2:");
        Integer num2 = input.nextInt();

        System.out.println("");

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num2 + " - " + num1 + " = " + (num2 - num1));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + ((float) num1 / (float) num2));
        System.out.println(num2 + " / " + num1 + " = " + ((float) num2 / (float) num1));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        System.out.println(num2 + " % " + num1 + " = " + (num2 % num1));
        System.out.println(num1 + " ^ " + num2 + " = " + ((int) Math.pow(num1, num2)));
        System.out.println(num2 + " ^ " + num1 + " = " + ((int) Math.pow(num2, num1)));
    }
}
