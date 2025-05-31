package day09_scanner;

import java.util.Scanner;

/*
    Ask the user to enter an int number.
        Determine if the number is even or odd
        Print a boolean for both even and odd
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int num = keyboard.nextInt();

        boolean isEven = num % 2 == 0; // true
        //boolean isEven - num % 2 != 1;
        boolean isOdd = num % 2 != 0; // false
        //boolean isOdd = !isEven;

        System.out.println(num + " is even " + isEven);
        System.out.println(num + " is odd " + isOdd);

        

    }

}
