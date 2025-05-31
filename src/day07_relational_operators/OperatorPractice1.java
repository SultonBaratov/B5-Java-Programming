package day07_relational_operators;

public class OperatorPractice1 {
    public static void main(String[] args) {
        int b = 12;

        b++; // Post increment: b = b + 1 = 13
        System.out.println(b);

        ++b; // Pre Increment: b= b + 1; b = 14;
        System.out.println(b);

        b--; // Post Decrement: b = b - 1; b = 13
        System.out.println(b);

        --b; // Pre Decrement: b = b - 1; b = 12
        System.out.println(b);

        System.out.println("------------------------");


        System.out.println(b++); // POST Increment(UPDATE) + Print(USE)
        // 1. print(use) - > 12
        // 2. update     - > b = 13
        System.out.println(b);

        System.out.println(++b); // PRE Increment(UPDATE) + Print(USE)
        // 1. update    - > b = 14
        // 2. print(use) - > 14
        System.out.println(b);

        System.out.println("------------------------");

        System.out.println(b--); // POST Decrement(update) + Print(USE)
        // 1. print(use) - > 14
        // 2. update     - > b = 13
        System.out.println(b);

        System.out.println(--b); // PRE Decrement(UPDATE) + Print(USE)
        // 1. update - > b = 12
        // 2. print(use) - > 12
        System.out.println(b);
    }
}
