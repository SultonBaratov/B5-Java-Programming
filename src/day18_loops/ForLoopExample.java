package day18_loops;

public class ForLoopExample {
    public static void main(String[] args) {

        // initialization --> int i = 0
        // condition --> i <= 5 (if condition is TRUE it wil execute code block / if FALSE it will end the loop)
        // iteration --> i++


        //#1 = for loop
        System.out.println("This is \"for\" loop");
        for (int i = 0; i <= 5; i++){
            System.out.println(i);


        }

        System.out.println();
        System.out.println("This is \"While\" loop");
        int x = 0;
        while (x <= 5) {
            System.out.println(x);
            x++;
        }


        System.out.println();
        System.out.println("This is \"Do\" loop");
        int y = 0;
        do {
            System.out.println(y);
            y++;
        } while (y <= 5);


    }

}
