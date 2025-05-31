package day10_IfStatements;

public class ifStatementWithoutBrackats {
    public static void main(String[] args) {

        if (5 < 1) //if statement without bracket only takes 1 single statement after/under itself
                   // So it will not show "Hi-1" statement
            System.out.println("Hi-1");
            System.out.println("Hi-2"); // This println statement is not part of "if" statement
            System.out.println("Hi-3"); // This println statement is not part of "if" statement
            // But if you have "int a = 0; than it will show "Hi-1"


    }
}
