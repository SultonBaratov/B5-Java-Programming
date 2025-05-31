package day09_scanner;

import java.util.Scanner;

/*
    Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values

    Ex:
        Enter a number
        65

    65 is divisible by 2: false
    65 is divisible by 3: false
    65 is divisible by 5: true
 */
public class DivisibleBy {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = keyboard.nextInt(); // 23

//        boolean isEvenlyDevisibleBy2 = number % 2 == 0; // 23 % 2 (1) == 0 is False because 2 not Divisible to 23
//        boolean isEvenlyDevisibleBy3 = number % 3 == 0; // 23 % 2 (1) == 0 is False because 3 not Divisible to 23
//        boolean isEvenlyDevisibleBy4 = number % 5 == 0; // 23 % 2 (1) == 0 is False because 2 not Divisible to 23

        boolean isEvenlyDevisibleBy2 = number % 2 == 0; // 30
        boolean isEvenlyDevisibleBy3 = number % 3 == 0; // 30
        boolean isEvenlyDevisibleBy4 = number % 5 == 0; // 30
        boolean isEvenlyDivisibleBy2_3_5 = isEvenlyDevisibleBy2 && isEvenlyDevisibleBy3 && isEvenlyDevisibleBy4;
        System.out.println(+number+ " is evenly divisible by 2, 3 and 5: " + isEvenlyDivisibleBy2_3_5);

        // if the number is divisible with either 2 or 3 or 5
        boolean isEvenlyDivisibleBy2or3or5 = isEvenlyDevisibleBy2 || isEvenlyDevisibleBy3 || isEvenlyDevisibleBy4;
        System.out.println(+number+ " is evenly divisible by 2 or 3 or 5: " + isEvenlyDivisibleBy2or3or5);

    }
}
