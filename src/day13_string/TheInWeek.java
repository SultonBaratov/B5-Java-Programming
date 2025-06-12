package day13_string;

import java.util.Scanner;

public class TheInWeek {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter a number that represents day of week (between 1-7): ");
        int weekDay = key.nextInt();

        String dayFromNum = "";

        switch (weekDay){
            case 7:
                //System.out.println("Sunday");
                dayFromNum = "Sunday";
                break;
            case 1:
                //System.out.println("Monday");
                dayFromNum = "Monday";
                break;
            case 2:
                //System.out.println("Tuesday");
                dayFromNum = "Tuesday";
                break;
            case 3:
                //System.out.println("Wednesday");
                dayFromNum = "Wednesday";
                break;
            case 4:
                //System.out.println("Thursday");
                dayFromNum = "Thursday";
                break;
            case 5:
                //System.out.println("Friday");
                dayFromNum = "Friday";
                break;
            default:
                //System.out.println("Not a day");
                dayFromNum = "Not a day";
                break;
            case 6:
                //System.out.println("Saturday");
                dayFromNum = "Saturday";
                break;
        }
        System.out.println(dayFromNum);
    }
}
