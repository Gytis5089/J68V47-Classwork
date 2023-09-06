import java.util.*;
public class Hobbies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name:");
        String name = input.next();

        System.out.print("Hobby:");
        String hobby = input.next();

        System.out.println("Hello, " + name + "!\n" + "I heard you're into " + hobby + ",\nThat's so cool, I am too!");
    }
}
