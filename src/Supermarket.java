import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Item 1 Name:");
        String item1Name = input.next();
        System.out.print("Item 1 Price:");
        Float item1Price = input.nextFloat();


        System.out.print("\nItem 2 Name:");
        String item2Name = input.next();
        System.out.print("Item 2 Price:");
        Float item2Price = input.nextFloat();

        System.out.print("\nItem 3 Name:");
        String item3Name = input.next();
        System.out.print("Item 3 Price:");
        Float item3Price = input.nextFloat();

        System.out.println("\n\n\nG-Mart");
        System.out.println(item1Name + "..........£" + item1Price);
        System.out.println(item2Name + "..........£" + item2Price);
        System.out.println(item3Name + "..........£" + item3Price);
    }
}
