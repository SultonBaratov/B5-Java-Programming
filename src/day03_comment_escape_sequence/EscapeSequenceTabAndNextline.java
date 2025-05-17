package day03_comment_escape_sequence;

public class EscapeSequenceTabAndNextline {
    public static void main(String[] args) {
        // Tab or separeter
        System.out.println("\tThis is tabbed");
        System.out.println("\t\tThis is tabbed");
        System.out.println("\tVlad");
        //------------------------------------------

        // \n --> is for next line
        System.out.print("\t\tThis is for new line.\nThis is for another line");
        System.out.println();
        System.out.println("\tNew Line");
    }
}
