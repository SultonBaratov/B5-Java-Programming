package day24_methods;
/*
    unlock the car
    open the door
    sit in the case + close the door
    start the engine
    put gear into drive
 */
public class Car {
    public static void unlock (){
        System.out.println("Unlocking the car");

    }

    public  static void openDoor (){
        System.out.println("Opening the door");
    }

    public static void sitInCar (){
        System.out.println("Sitting in the car");
        System.out.println("Clossing the door");
    }

    public static void getReady (){
        System.out.println("Putting seat belt on");
        System.out.println("Check the mirrors");
        System.out.println("Turn the music on");
        System.out.println("Lower the window down");
        System.out.println("Set up destination");
    }

    public static void allStepsToDriveCar (){
        unlock();
        openDoor();
        sitInCar();
        getReady();
    }

    public static void main(String[] args) {
        unlock();

        openDoor();
        
        sitInCar();

        getReady();
        System.out.println("---------------------------------");

    }



}
