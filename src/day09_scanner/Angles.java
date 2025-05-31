package day09_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);

        System.out.println("Please, enter 3 angles: ");
        double angle1 = keyboard.nextDouble();
        double angle2 = keyboard.nextDouble();
        double angle3 = keyboard.nextDouble();

        double sumOfAngles = angle1+angle2+angle3;

        //if all 3 angles adds up to 180 than it is tringle
        boolean isTriangle = sumOfAngles == 180.00;
        // if all angles adds up to 360, it is circle
        boolean isCircle = sumOfAngles == 360.00;

        System.out.print("Is it a triangle: "+isTriangle);
        System.out.print("Is it a circle: "+isCircle);

    }
}
