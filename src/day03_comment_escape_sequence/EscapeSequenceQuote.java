package day03_comment_escape_sequence;

public class EscapeSequenceQuote {
    public static void main(String[] args) {
        /*
            Q: To be able to print we need double quotes itself
                Ex: Programming Language "Java" is great one.
                \\ --> Back slash
                // --> Forward slash
                One is Functionality and second to quote/mark section
                (\\Java\\ result \Java\ same for \"Java\" result 'Java")
                Sample:
                    \"
                    \'
                    \\
         */
        System.out.println("Programming language Java is great one.");
        System.out.println("Programming language \"Java\" is great one.");
        System.out.println("Programming language \\Java\\ is great one.");
    }
}
