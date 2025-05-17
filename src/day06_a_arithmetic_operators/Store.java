package day06_a_arithmetic_operators;

public class Store {
    public static void main(String[] args) {

        String storeName = "Costco";
        int numberOfTv = 100;

        System.out.println("in " +storeName+ " we have "+numberOfTv + "Tvs");
        System.out.println("Someone came and put 1 TV in the cart and that person is still in the store and in stock we have "+numberOfTv--);// still 100TV in stock because person not left store
        //person paid for purchased TV - that why we use POST increment
        System.out.println(("Now in the stock in the we have " +numberOfTv ));
        System.out.println("That same customer returned, and store actually pout i back in stock and in the stock we have " +  ++numberOfTv + " TV");
    }
}
