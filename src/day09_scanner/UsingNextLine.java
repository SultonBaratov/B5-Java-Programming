package day09_scanner;

import java.util.Scanner;

public class UsingNextLine {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What day is today: ");
        String day = key.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = key.next();

        System.out.print("Enter your last name: ");
        String lastName = key.next();

        System.out.print("Please, enter your address: ");
        String address = key.nextLine(); // Since next line is taking multiple things as an input including space, character and even pressing enter as an input
        // The rule for nextLine() is --> if there any other scanner methods before nextLine() method we have to hand ENTER
        // To hand it: we use an extra key.nextLine();
        key.nextLine();

        System.out.print("Please enter your job title: ");
        String jobTitle = key.nextLine(); // server

        System.out.print("Please, enter your team member names: ");
        String teamMember = key.nextLine();

        System.out.print("How many team members you have in your team: ");
        int numOfTeamMember = key.nextInt();

        System.out.print("What are the holidays you have: ");
        String holidays = key.nextLine();
        key.nextLine();



    }
}
