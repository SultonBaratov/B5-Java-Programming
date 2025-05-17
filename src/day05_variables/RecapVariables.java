package day05_variables;
/*


 */


public class RecapVariables {
    public static void main(String[] args) {
        // Declare variables
        byte numOfCoffeeCups;
        double totalPriceOfCoffee;
        int numOfStudents;

        System.out.println();
        numOfCoffeeCups = 10;
        totalPriceOfCoffee = 20.22;
        numOfStudents = 20;

        System.out.println("$" + numOfCoffeeCups);
        System.out.println("$"+ totalPriceOfCoffee);
        System.out.println("$"+ numOfStudents);

        System.out.println();

        System.out.println("Total price of coffee $" + numOfCoffeeCups * numOfStudents);

        System.out.println(numOfCoffeeCups + " * " + numOfStudents);

        //Declare and Assign value directly
        // = is Assignment Operator
        // . is Dot operator
        double temperature = 25.5;
        float earthDiameter = 1274243534.34f;

        System.out.println("Today the temperature was " + temperature + " degrees Farenheit");
        System.out.println();



    }
}
