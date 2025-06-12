package day15_string;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("Please enter a message: ");
        String userMessage = key.nextLine().trim().toLowerCase();

        boolean hasBadWords = userMessage.contains("Java is bad") || userMessage.contains("quit") || userMessage.contains("have fun") || userMessage.contains("crying");

        if (hasBadWords){
            System.out.println("Message fail to send");
        }


    }
}
