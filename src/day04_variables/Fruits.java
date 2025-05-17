package day04_variables;

public class Fruits {
    public static void main(String[] args){
        int apple = 80;
        int grape = 100;
        int banana = 150;
        System.out.println("This is how many apples we have: " + apple);
        //System.out.println("This is how many apples we have: 80"); // hard coding - using static value
        System.out.println("I have sold 50 apples");
        apple = 80 - 50; //reassigne new value

        int applePrice = 15; // this price of my 30 apple is $15
        System.out.println("This price of my  " + apple + " apples is $" + applePrice); // dynamically used data

        // Plus "+" letter is Concatenation -> after first double quote, everything is put next to each other
        // After concatenation (including concatenation) -> everything become LETTER data type (String)
        System.out.println(10 + 10); // NO double quotation in this line of code
        System.out.println("" + 10 + 10); // 1010
        System.out.println(10 + 10 + "" + 10 + 10); // 201010
        System.out.println("" + 10 + 10 + "" + 10 + 10); // 10101010
        System.out.println("ab" + 10 + 10 + "" + 10 + 10); // ab10101010
        System.out.println("ab" + 10 + 10 + 10 + 10); //
        System.out.println("" + 10 + 10 + "  " + 10 + 10); // 1010  1010
        System.out.println(10 + 10 + "  " + 10 + 10); // 20  1010

        System.out.println("" + (10 + 10)); // "20"

        // 4 * 3 + 2 = 14
        // 4 * (3 + 2) = 20

        // String : Anything in double or started with double quote is String






    }
}
