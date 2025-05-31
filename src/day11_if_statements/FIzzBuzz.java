package day11_if_statements;

import java.util.Scanner;

public class FIzzBuzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter a number: ");
        int userNum = input.nextInt();

        // A: Option 1
        if (userNum % 3 == 0 && userNum % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (userNum % 3 == 0){
            System.out.println("Fizz");
        }else if (userNum % 5 == 0){
            System.out.println("Buzz");
        }

        System.out.println("-------------------------------------");

        // A: Option 2
        if (userNum % 3 == 0 && userNum % 5 != 0) {
            System.out.println("Fizz");
        }

        if (userNum % 5 == 0 && userNum % 3 != 0) {
            System.out.println("Buzz");
        }

        if (userNum % 3 == 0 && userNum % 5 == 0) { // } else if (userNum % 15 == 0) {
            System.out.println("FizzBuzz");
        }

        System.out.println("-------------------");

        // A: Option 3 - combine
        if (userNum % 3 == 0 && userNum % 5 != 0) {
            System.out.println("Fizz");
        } else if (userNum % 5 == 0 && userNum % 3 != 0) {
            System.out.println("Buzz");
        } else if (userNum % 3 == 0 && userNum % 5 == 0) { // } else if (userNum % 15 == 0) {
            System.out.println("FizzBuzz");
        }


    }
}
