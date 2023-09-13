import java.util.Scanner;

public class AccGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First Name:");
        String fName = input.next();
        System.out.println("Last Name:");
        String lName = input.next();
        System.out.println("Birth Year:");
        Integer bYear = input.nextInt();

        String username = fName.substring(0, 1).toUpperCase() + lName.toLowerCase();
        String password = lName.substring(0, 1).toLowerCase() + fName.toUpperCase() + Integer.toString(bYear);

        System.out.println("\nUsername: " + username);
        System.out.println("Password: " + password);
        System.out.println("\nBrought to you by  Extremely Secure Account Service");
        System.out.println("Let's just hope nobody was looking while your password was publicly printed :)");
    }
}
