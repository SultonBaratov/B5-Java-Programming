package day12_switch_statements;

public class AmazonPrime {
    public static void main(String[] args) {

        double price = 9.99;
        boolean hasPrime = true;

        // Option 1 - MULTI BRANCH IF / ELSE-IF
        if (hasPrime) {
            System.out.println("Eligible for 2 day shipping");
        } else if (!hasPrime && price >= 25) {
            System.out.println("Eligible for regular free shipping");
        } else if (!hasPrime && price < 25){
            System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
        }


        System.out.println("-----------------------------------------------------------");
        // Option 2
        if (hasPrime){
            System.out.println("Eligible for 2 day shipping");
        } else {  // !hasPrime
            if (price >= 25){
                System.out.println("Eligible for regular free shipping");
            } else { // price < 25
                System.out.println("Not eligible for free shipping. Shipping fee: 3.99");
            }
        }

    }

}
