package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Declared two double variable
        double balance, withdraw;

        System.out.println("What is your balance: ");
        balance = scanner.nextDouble();

        System.out.println("How much do you want to withdraw: ");
        withdraw = scanner.nextDouble();


        // Lets say now, I want to withdraw more than my balance
        /*
            If withdraw if bigger than balance  - > print "Not Enough Balance"
            Otherwise, allow withdrawing and update the remaining balance and print "Your new balance is: $balance"
         */

        // Option 1
        if(balance >= withdraw) {
            //balance = balance - withdraw;
            balance -= withdraw;
            System.out.println("Your new balance is: $" + balance);
        } else {
            System.out.println("Not Enough Balance");
        }

//
//        // Option 2
//        if (withdraw > balance) {
//            System.out.println("Not Enough Balance");
//        } else {
//            //balance = balance - withdraw;
//            balance -= withdraw;
//            System.out.println("Your new balance is: $" + balance);
//        }
//
//
//
//        // Option 3handled it with 2 if statements
//        if (withdraw > balance) {
//            System.out.println("Not Enough Balance");
//        }
//
//
//        if (balance >= withdraw) {
//            //balance = balance - withdraw;
//            balance -= withdraw;
//            System.out.println("Your new balance is: $" + balance);
//        }


    }
}
