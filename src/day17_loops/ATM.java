package day17_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int validPinCode = 9247;
        int userEnterPincode;

        System.out.println("Welcome to ATM");
        int numberOfallowdPin = 3;
        do {
            System.out.print("Please enter pin code: ");
            userEnterPincode = key.nextInt();
            numberOfallowdPin--;

        } while (userEnterPincode != validPinCode && numberOfallowdPin > 0);

        if (userEnterPincode == validPinCode) {
            System.out.println("You successfully logged in!");
        } else {
            System.out.println("You have reached maximum amount of incorrect pin attempts, please call customer service.");
        }

//        int validPinCode = 9876;
//        int userEnterPinCode;
//        int attemptCount = 3;
//
//
//        System.out.println("Welcome to ATM");
//
//        do {
//            System.out.print("Please, enter pin code: ");
//            userEnterPinCode = key.nextInt();
//
//
//            attemptCount--;
//
//            if ( userEnterPinCode != validPinCode && attemptCount != 0) {
//                System.out.println("Try again!");
//            }
//
//        } while ( userEnterPinCode != validPinCode && attemptCount > 0 );
//
//
//        if (attemptCount == 0 && userEnterPinCode != validPinCode ) {
//            System.out.println("You have tried 3 times and you are locked out. Please, call us!");
//        } else {
//            System.out.println("You successfully logged in!");
//        }














        }
}
