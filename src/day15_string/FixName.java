package day15_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = key.next();
        System.out.print("Please enter your last name: ");
        String lastName = key.next();

        System.out.println("--------------------------------------");
        System.out.println("Your entered first name: "+firstName.charAt(firstName.charAt(0)));
        System.out.println("Your entered last name: "+lastName.charAt(firstName.charAt(5)));




    }
}
