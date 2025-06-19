package day18_loops;

import java.util.Scanner;

public class SpacePrograme {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, a sentence: ");
        String userInput = key.nextLine().replace(" ",  "_");  // more java is good ----- > .replace(" ", "_"); -- > more_java_is_good
        // java --- > j a v a
        // java book -> j a v a _ b o o k

        String userInputWithSpace = "";

        for (int i = 0; i < userInput.length(); i++) {
            //System.out.print(userInput.charAt(i));
            //System.out.print(" ");

            //userInputWithSpace += userInput.charAt(i);
//            if (userInput.charAt(i) == ' '){ // this part adds '_'
//                userInputWithSpace += "_ ";
//            } else {
//                userInputWithSpace += userInput.charAt(i) + " ";
//            }
        }

        System.out.println("Original user input: " + userInput);
        System.out.println("With space: " + userInputWithSpace);


    }
}
