package day18_loops;

import java.util.Scanner;

/*
    Task:
        declare and assign a number
        print all the multiplication results for 1 through 10
        Ex:
            4
            4 x 1 = 4
            4 x 2 = 8
            4 x 3 = 12
            4 x 4 = 16
            ..
            4 x 10 = 40
 */
public class MutliplicationTable {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        //int i = 4;

        System.out.println("Please add the number");
        int num = key.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }

        System.out.println("____________________________");
        int num1 = 5;

        System.out.println(num1 + " x " + 1 + " = " + num1 * 1);
        System.out.println(num1 + " x " + 2 + " = " + num1 * 2);
        System.out.println(num1 + " x " + 3 + " = " + num1 * 3);
        System.out.println(num1 + " x " + 4 + " = " + num1 * 4);
        System.out.println(num1 + " x " + 5 + " = " + num1 * 5);
        System.out.println(num1 + " x " + 6 + " = " + num1 * 6);
        System.out.println(num1 + " x " + 7 + " = " + num1 * 7);
        System.out.println(num1 + " x " + 8 + " = " + num1 * 8);
        System.out.println(num1 + " x " + 9 + " = " + num1 * 9);
        System.out.println(num1 + " x " + 10 + " = " + num1 * 10);


        System.out.println("--------------------------");
        for(int y = 1; y <= 10; y++){
            System.out.println(num + " x " + y + " = " + num * y);
        }


    }


}
