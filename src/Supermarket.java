import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of Items:");
        Integer itemAmount = input.nextInt();
        String[] itemNames = new String[itemAmount];
        Float[] itemPrices = new Float[itemAmount];
        Float totalPrice = 0F;

        for (Integer i = 0; i < itemAmount; i++) {
            System.out.print("\nItem " + (i + 1) + " Name:");
            String itemName = input.next();
            itemNames[i] = itemName;
            System.out.print(itemName + " Price:");
            Float itemPrice = input.nextFloat();
            itemPrices[i] = itemPrice;
            totalPrice += itemPrice;
        }

        System.out.println("\n\nG-Mart");

        for (Integer i = 0; i < itemAmount; i++) {
            System.out.println(itemNames[i] + "..........£" + itemPrices[i]);
        }

        System.out.println("Total..........£" + totalPrice);
    }
}
