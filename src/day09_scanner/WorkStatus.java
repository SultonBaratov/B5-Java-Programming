package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String FirstName = key.next();

        System.out.print("Please, enter your last name: ");
        String LastName = key.next();

        System.out.print("Are you employed? (True/False): ");
        boolean employed = key.nextBoolean();

        System.out.print("Are you student? (True/False): ");
        boolean student = key.nextBoolean();

        String infoAboutPerson = "The person with first name " +FirstName +" and last name " + LastName +"\n\tCurrently employed: "+ employed + "\n\tor student: "+student;
        System.out.println("\t"+infoAboutPerson);


    }
}
