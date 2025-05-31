package Day12_switch_statements;

public class NumberInWords {
    public static void main(String[] args) {

        int num = 5;

        if (num == 0) {
            System.out.println("Zero");
        }else if (num == 1) {
            System.out.println("One");
        }else if (num == 2) {
            System.out.println("Two");
        }else if (num == 3) {
            System.out.println("Three");
        }else if (num == 4) {
            System.out.println("Four");
        }else if (num == 5) {
            System.out.println("Five");
        }else if (num == 6) {
            System.out.println("Six");
        }else if (num == 7) {
            System.out.println("Seven");
        }else if (num == 8) {
            System.out.println("Eight");
        }else if (num == 9) {
            System.out.println("Nine");
        }

        System.out.println("------------------------");

        // Switch work only with five Veriebles "String, char, int, byte"
        // Switch cannot compare with relational operator ">, <, <=, >=, == !="
        // Same value cannot be used for different case
        switch (num) { // Follow Varieble No.
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;


        }

    }
}
