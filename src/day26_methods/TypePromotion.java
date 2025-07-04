package day26_methods;

public class TypePromotion {
    public static void main(String[] args) {

        /*
        Type promotion
            - When calling a methods with parameters
                - It first tries to find the exact matching data type
                - If not found, it will call the next matching
         */


        //use(10); // whole number by default are int datatype in java
        byte b = 10;
        use(b); // type promotion

        short s = 20;
        use(s); // type promotion
    }

    public static void use (byte b) {
        System.out.println("printing byte");
    }

    public static void use (short s) {
        System.out.println("printing short");
    }

    public static void use (int i) {
        System.out.println("printing int");
    }


    public static void use (float f) {
        System.out.println("printing float");
    }

    public static void use (double d) {
        System.out.println("printing double");
    }

}
