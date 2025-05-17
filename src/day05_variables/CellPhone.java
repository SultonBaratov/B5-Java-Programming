package day05_variables;
///*
//    create a class CellPhone
//    create a main method
//    declare and assign these variables:
//        brand, model, color, price, storage, hasCamera, sim(char A, B, C)
//
//    Print all the variables
//
//        sample data: apple, iphone 10, black, 1000.99, 128, true, A
// */


public class CellPhone {
    public static void main(String[] args) {
        String brand = "Samsung";
        int model = 24;
        String color = "grey";
        double price = 999.99;
        int storage = 512;
        boolean hasCamera = true;
        char sim = 'a';

        System.out.println("I have " +brand + " "+ model + " color " + color + " that cost me "+ "$"+ price + " it has " + storage + " Gigabyte, and the answer is " + hasCamera + " it has good camera. But only issue is that is has only one space for sim" +sim+ " zone.");

    }
}
