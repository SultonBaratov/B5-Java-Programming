package day18_loops;

import java.util.Scanner;

/*
    repeated actions
        -ask the user to enter the item
        -add item to the shopping list
        -ask user if they want to add more items.

    At the end show the whole item list
 */
public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String shoppingList = "Your shopping list: ";
        String userAnswer = "";

        do {
            System.out.print("Please enter the name of item: ");
            String itemName = key.nextLine();

            shoppingList += "\n\t\t\t" + itemName;
            System.out.println("Do you want to add another item (yes/no)");
            userAnswer = key.nextLine();
        } while (userAnswer.equalsIgnoreCase("yes"));

        System.out.println(shoppingList);


    }


}
