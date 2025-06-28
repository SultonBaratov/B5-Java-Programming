package day24_methods;

import java.util.Arrays;

public class Group {
    public static void main(String[] args) {
        String group1Name1 = "Ayaz";
        String group1Name2 = "Gulden";
        String group1Name3 = "Savlat";
        String group1Name4 = "Yuriy";
        String group1Name5 = "Suidum";

        String [] group2Students = {group1Name1, group1Name2, group1Name3, group1Name4,group1Name5}; // Single dimention Array
        String [] group3Students = {"Jana", "Polina", "Sultan"};                                     // // Single dimention Array



        String [][] groups = {group2Students, group3Students}; // Multi dimention Array
        // Signle Dimmension
        System.out.println("Sigle dimmensional array = group 2: " + Arrays.toString(group2Students));
        System.out.println("Sigle dimmensional array = group 3: " + Arrays.toString(group3Students));

        // Multi Dimmention
        System.out.println("Sigle dimmensional array = group 2: " + Arrays.deepToString(groups));

        System.out.println("-------------------------------");
        // How many elements this 2 D Array has
        System.out.println("Multi(2) D array - has size: " +groups.length); // Multi(2) D array - has size: 2
        // How many elements each single dimmentional array has
        System.out.println("Single D array - how many ellement in each " + group2Students.length + group3Students.length); // Single D array - how many ellement in each 53
        System.out.println("Single D array - how many ellement in each " + Arrays.toString(groups[0])); // Single D array - how many ellement in each [Ayaz, Gulden, Savlat, Yuriy, Suidum]
        System.out.println("Single D array - how many ellement in each " + Arrays.toString(groups[1])); // Single D array - how many ellement in each [Jana, Polina, Sultan]

        System.out.println("Single D array - how many ellement in each " + groups[0].length); // Single D array - how many ellement in each 5
        System.out.println("Single D array - how many ellement in each " + groups[1].length); // Single D array - how many ellement in each 3

        System.out.println("----------------------------------");
        String [][] mentoGroups = new String [3][]; // [null, null, null] This 2D array, will hold 3 Single D array
        String [][] loopcampGroups = new String [4][2]; // [[null, null], [null, null], [null, null], [null, null]] This 2D array, will hold 4 Single D array
        System.out.println(Arrays.deepToString(mentoGroups));
        System.out.println(Arrays.deepToString(loopcampGroups));

        String [][] studyGroups = {
                {"Ayaz", "Gulden", "Savlat", "Yuriy", "Suidum"},
                {"Jana", "Polina", "Sultan"}
        };

        System.out.println("_________----------------------");
        // print each group from 2D array
        System.out.println(Arrays.toString(studyGroups[0]));
        System.out.println(Arrays.toString(studyGroups[1]));

        System.out.println("--------------------------------");
        for (int i = 0; i < studyGroups.length; i++) {
            System.out.println(Arrays.toString(studyGroups[i] ) );

        }

        System.out.println("--------------------------------");
        for (String[] eachSignleDArray : studyGroups) {
            System.out.println(Arrays.toString(eachSignleDArray));
        }

        System.out.println("--------------------------------");
        // in Every cycle, we get Signle D array = String from beginning to all the way end
        for (String [] eachSingleDArray : studyGroups) {

            for (String eachName : eachSingleDArray){
                System.out.println(eachName); // all names printed
            }
            System.out.println(); // To separate group
        }

    }
}
