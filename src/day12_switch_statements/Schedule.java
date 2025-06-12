package day12_switch_statements;

import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What day of the week is it today?: ");
        String day = keyboard.next();

        switch (day) {
            case "Monday", "monday", "1", "mon":
                System.out.println("We have Mentor Session on Monday");
                break; // if i want to print only one statement // so if i dont put break it will print bellow statement
            case "Tuesday":
                System.out.println("We have no classes");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("We have Java classes");
                break;
            default:
                System.out.println("No valid");
        }



    }
}
