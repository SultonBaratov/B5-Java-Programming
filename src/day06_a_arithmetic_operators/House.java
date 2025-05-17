package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */

public class House {
    public static void main(String[] args) {
        String housetype = "Condo";
        int numberofbedrooms = 3;
        int numberofbathroom = 3;
        int numberofkitchen = 1;
        boolean isthereabasement = false;
        boolean isthereanattic = true;
        boolean istherepool = true;
        String isthehouseforsale = "Yes";
        double costofthehouse = 599999;
        String addresszipcode = "75 King st Alexandria 22315";
        String isaparknearby = "Yes";
        int ratingofsurroundingschooldistricts = 5;

        System.out.println("\t\t\t-----Condo-----");

        System.out.println("House type is: \t\t\t\t" + housetype);
        System.out.println("Number of bedrooms: \t\t" + numberofbedrooms);
        System.out.println("Number of bathrooms:\t\t" + numberofbathroom);
        System.out.println("Number of kitchen:\t\t\t" + numberofkitchen);
        System.out.println("Is there a basement?\t\t" + isthereabasement);
        System.out.println("Is there an attic?\t\t\t" + isthereanattic);
        System.out.println("Is there pool?\t\t\t\t" + isthereanattic);
        System.out.println("Is the house for sale?\t\t" + isthehouseforsale);
        System.out.println("Cost of the house?\t\t\t" +"$"+ costofthehouse);
        System.out.println("Address,zipcode:\t\t\t" + addresszipcode);
        System.out.println("Is a park near by?\t\t\t" + isaparknearby);
        System.out.println("Rating of surrounding \nschool districts 1 to 5:\t" +ratingofsurroundingschooldistricts);

        // Single house, Town house, Apartment, Penthouse, Multifamily
        String houseType = "Penthouse", address = "123 Test St, Fairfax, VA";

        // The following will give an error because, Java reads the file from top to bottom and var's not declared yet before they are being used.
        //int allRooms = numberOfBedrooms + numberOfBathrooms + numberOfKitchens;
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        int zipcode = 22033;


        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isForSale = true;
        boolean isParkNearBy = false;

        double costOfTheHouse = 675_000.99;
        double schoolRatings = 4.5;
        //int zipcode = 22033; // We canNOT declared SAME variable name twice in the SAME method.


        // The $houseType is located at $address $zipcode.
        System.out.println("The " + houseType + " is located at " + address + " " + zipcode + ".");

        System.out.println("This house has following info: \n\tCosts $" + costOfTheHouse + "\n\tHas attic: " + hasAttic + "\n\tHas pool: " + hasPool + "\n\tIs for sale: " + isForSale + "\n\tHas basement: " + hasBasement + "\n\tIs park newar by: " + isParkNearBy + "\n\tSchool ratings: " + schoolRatings);

        System.out.println("It has the following info for the rooms:" + "\n\tNumber of Bedrooms: " + numberOfBedrooms + "\n\tNumber of Bathrooms: " + numberOfBathrooms + "\n\tNumber of Kitchens: " + numberOfKitchens);


        System.out.println("--------------------------------------------------------------------------");
        String houseInfo1 = "The " + houseType + " is located at " + address + " " + zipcode + ".";
        String houseInfo2 = "This house has following info: \n\tCosts $" + costOfTheHouse + "\n\tHas attic: " + hasAttic + "\n\tHas pool: " + hasPool + "\n\tIs for sale: " + isForSale + "\n\tHas basement: " + hasBasement + "\n\tIs park newar by: " + isParkNearBy + "\n\tSchool ratings: " + schoolRatings;
        String houseInfo3 = "It has the following info for the rooms:" + "\n\tNumber of Bedrooms: " + numberOfBedrooms + "\n\tNumber of Bathrooms: " + numberOfBathrooms + "\n\tNumber of Kitchens: " + numberOfKitchens;

        System.out.println(houseInfo1 + "\n" +houseInfo2 + "\n" +houseInfo3);


        System.out.println("--------------------------------------------------------------------------");
        String allInfo = "The " + houseType + " is located at " + address + " " + zipcode + "."
                + "\nThis house has following info: \n\tCosts $" + costOfTheHouse + "\n\tHas attic: " + hasAttic + "\n\tHas pool: " + hasPool + "\n\tIs for sale: " + isForSale + "\n\tHas basement: " + hasBasement + "\n\tIs park newar by: " + isParkNearBy + "\n\tSchool ratings: " + schoolRatings
                + "\nIt has the following info for the rooms:" + "\n\tNumber of Bedrooms: " + numberOfBedrooms + "\n\tNumber of Bathrooms: " + numberOfBathrooms + "\n\tNumber of Kitchens: " + numberOfKitchens;
        System.out.println(allInfo);

        System.out.println("--------------------------------------------------------------------------");
        String allInfo2 = houseInfo1 + "\n" +houseInfo2 + "\n" +houseInfo3;
        System.out.println(allInfo2);
    }

}
