package day09_scanner;

import java.util.Scanner;

public class YourInfo {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter your favorite book: ");
        String book = key.nextLine(); // Next will show only single word up to SPACE ____

        //System.out.println("This is the book you like: " + book);
        System.out.print("Please, enter your age: ");
        byte age = key.nextByte();

        System.out.print("Please, enter your favorite number: ");
        long favoritNum = key.nextLong();
        System.out.println();

        System.out.println("\tinfo you entered: ");
        System.out.print("\t" + book);
        System.out.print("\t" + age);
        System.out.print("\t" + favoritNum);



    }
}
