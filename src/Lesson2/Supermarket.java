package Lesson2;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of Items:");
        Integer itemAmount = input.nextInt();
        String[] itemNames = new String[itemAmount];
        Float[] itemPrices = new Float[itemAmount];
        Float totalPrice = 0F;
        Integer[] charLens = new Integer[itemAmount];

        for (Integer i = 0; i < itemAmount; i++) {
            System.out.print("\nItem " + (i + 1) + " Name:");
            String itemName = input.next();
            itemNames[i] = itemName;
            System.out.print(itemName + " Price:");
            Float itemPrice = input.nextFloat();
            itemPrices[i] = itemPrice;
            totalPrice += itemPrice;
            charLens[i] = itemName.length();
        }

        Integer longestLen = 0;

        for (Integer i = 0; i < itemAmount; i++) {
            if (charLens[i] > longestLen) {
                longestLen = charLens[i];
            }
        }

        System.out.println("\n\nG-Mart");

        for (Integer i = 0; i < itemAmount; i++) {
            // Take the longest character, remove the current item length, add 5 and repeat the dot that amount of times (it works (source: trust me))
            System.out.println(itemNames[i] + (".".repeat(longestLen - itemNames[i].length() + 5)) + "£" + itemPrices[i]);
        }

        System.out.println("Total" + (".".repeat(longestLen)) + "£" + Math.round(totalPrice));
    }
}
