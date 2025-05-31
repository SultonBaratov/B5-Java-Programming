package day09_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter price for item $");
        int price = (int)key.nextDouble(); // 3.99 ---> 3

        //System.out.print("Please, enter quantity for the item: "+key.nextByte()+"EA");

        System.out.print("Please, enter quantity for the item ");
        int quantity = key.nextByte();

        double revenue = price * quantity;
        System.out.print("Revenue value $"+revenue);
        double RevenueValue = key.nextDouble();




    }
}
