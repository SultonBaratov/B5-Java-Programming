package day14_string;

public class Contains {
    public static void main(String[] args) {

        // #8 - "".contains(""); --> will check if ("") anywhere in the String. If yes, returns TRUE, if not FALSE

        String str = "Today's Java topic is all about String methods";

        System.out.println(str.contains("Javatopic")); // Fasle because above contents not include Javatopic it is Java topic
        System.out.println(str.contains("Java topic")); // True
    }
}
