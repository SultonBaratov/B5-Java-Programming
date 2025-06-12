package day16_loops;

public class MethodChaining {
    public static void main(String[] args) {

        String sentence = "Today is Wednesday. Wednesday is a fun day because on Wednesday we have Java classes.";
        System.out.println(sentence);

        // Method Chaining: combining multiple methods together.
        // you can combine methods together AS LONG AS method returns String

        sentence = sentence.substring(sentence.indexOf(".") + 2, sentence.lastIndexOf(" is")).toUpperCase().toLowerCase().trim();
        System.out.println(sentence);


    }
}
