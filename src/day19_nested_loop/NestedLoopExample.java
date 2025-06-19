package day19_nested_loop;

public class NestedLoopExample {
    public static void main(String[] args) {

        // print : Hello World
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }

        System.out.println("------------------------");

        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");
        System.out.println("Hello Galaxy");
        System.out.println("Hello Moon");
        System.out.println("Hello Moon");

        System.out.println("-------------------------");
        // Nested Loop

        for (int i = 1; i <= 3; i++) { // Outer Loop
            System.out.println("Hello Galaxy");
            for (int j = 1; j <= 3; j++) { // Inner Loop
                System.out.println("Hello Moon");

            }
        }


    }
}
