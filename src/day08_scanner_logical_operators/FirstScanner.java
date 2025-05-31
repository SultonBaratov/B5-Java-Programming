package day08_scanner_logical_operators;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {

        //Scanner input ---> 'Input' is the object reference name / variable name
        // It says give something to give to me/here to give something out
        // Is non-primative because it is start with Capital Latter
        // By using Scanner we declared and instatiated Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name: ");

        //String name = "Tom Jerry";
        String name = input.nextLine();

        System.out.println();
        System.out.println("My name is: " +name);

    }
}
