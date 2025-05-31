package day11_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int oxygenLevel = 49;

        if (oxygenLevel >= 90) {
            System.out.println("Your oxygen level is full");
        }else if (oxygenLevel >= 80){
            System.out.println("You have enough oxygen level but keep watching");
        }else if (oxygenLevel >= 70){
            System.out.println("Your oxygen level is 70%");
        }else if (oxygenLevel >= 60){
            System.out.println("Dont go too far");
        } else if (oxygenLevel >= 50) {
            System.out.println("Be careful now you are at 50%");
        }else {
            System.out.println("Danger you have not enough oxygen");
        }


    }
}
