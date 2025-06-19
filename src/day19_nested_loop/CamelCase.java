package day19_nested_loop;

import java.util.Scanner;

/*
Camel Case

            Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase

            Ex:

                Today is SUNDAY

                Output:

                todayIsSunday

 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Please enter multiple words in sentence: ");
        String sentence = key.nextLine().trim().toLowerCase();

        String camelCaseVersion = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
               camelCaseVersion += (""+sentence.charAt(i+1)).toUpperCase();// the part where space removed "i+1" mean link the next word
            i++;
            } else {
                camelCaseVersion += sentence.charAt(i);
            }
        }


        System.out.println(camelCaseVersion);

        System.out.println("===========================");


        String camelCaseVersion2 = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                camelCaseVersion2 += (""+sentence.charAt(i)).toUpperCase(); // the part where space removed "i+1" mean link the next word

            } else {
                camelCaseVersion2 += sentence.charAt(i);
            }
        }


        System.out.println(camelCaseVersion2.replace(" ", ""));


    }


}
