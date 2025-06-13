package day17_loops;

import java.util.Scanner;

public class GussNumber {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int secretnum = 435;
        int useGuest;

        do {
            System.out.println("Please guess what secret number is: ");
            useGuest = key.nextInt();
            if (useGuest < secretnum){
                System.out.println("It is low go higher");
            } else if (useGuest > secretnum){
                System.out.println("it is high go lower");
            } else{
                System.out.println("Guess Correctly");
            }
        } while (useGuest != secretnum);
        if (useGuest == secretnum){
            System.out.println("It is right number, it was: " +secretnum);
        }
//TODO in this come implete it to only allow user to guess 4 times
        // Hint check ATM tesk

    }
}
