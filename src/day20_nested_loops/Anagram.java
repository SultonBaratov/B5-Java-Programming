package day20_nested_loops;

import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {


        String word1 = "Listen";
        String word2 = "silent";

        if (word1.length() != word2.length()){
            System.out.println("It is not anagram");
        } else {
            // word1 = Listen -->
            // word2 = silent -->
            for (int i = 0; i < word1.length(); i++) {

                String eachCharInWord1 = "" + word1.charAt(i);

                word2 = word2.replaceFirst(eachCharInWord1, "");

            }
            if (word1.isEmpty()){
                System.out.println("It is Anagram");
            } else {
                System.out.println("It is not Anagram");
            }
        }
    }
}
