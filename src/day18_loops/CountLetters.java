package day18_loops;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter the letter: ");
        String str = "aabbcaa";
        char letter = ' ';
        int counter = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter){
                counter++;
            }
        }
        System.out.println("You have " + counter + " letter " + letter);


    }
}
