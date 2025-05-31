package day11_if_statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers: ");

        int a = key.nextInt();
        int b = key.nextInt();
        int c = key.nextInt();

        if (a >= b && a >= c) {
            System.out.print("The biggest number is: "+a);
        }else if (b >= a && b >= c) {
            System.out.print("THe biggest number is: "+b);
        }else if (c >= b && c >= b) {
            System.out.print("The biggest number is: "+c);
        }else {
            System.out.println("All numbers are equal");
        }

    }
}
