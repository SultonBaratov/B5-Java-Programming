package day27_wrapper_arrayList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // What is data structure: It is container that hold data in specific structure way

        int a = 45; // This is not a data structure. It is local container (variable) that hold single data
        int [] arr = {12, 34, 2354}; // This is array data structure that hold multiple data of same data type
        Integer [] arr2 = {23, 54, 345}; // array data structure works with BOTH - Primative and Non-primative data type. Size is Fixed and had indexes.

    /*
    Note: All other data structure in Java, only works with OBJECT type (non-primative). DOes not work with primitive
    ArrayList
        - Work with only with object type (non-primative). DOes not work with primitive.
        - Size is flexible (changeble). Not fixed like Array
        - Comes from java.util package
     */


        // ArrayList <int> arrList; not work with primative
        ArrayList <Integer> arrList; // We just declare the OBJECT reference. Not assigned object itself yet.
        //System.out.println(arrList); Since there is not initial value we cannot print/use

        ArrayList<Integer> arrList2 = null; // I create ArrayList of Integer reference, with no Actual object yet.
        System.out.println(arrList2); // outcome: null

        ArrayList <Integer> arrList3 = new ArrayList<>(); // I created ArrayList of Integer, with Actual Object
        System.out.println(arrList3); // outcome: []

        ArrayList <Integer> arrList4 = new ArrayList<>(10); // Creating ArrayList of integer with initial Capacity by 10 - but no one use because ArrayList already flexible
        System.out.println("-------------------------------");
        // .size();
        System.out.println(arrList4.size()); // 0
        System.out.println("-------------------------------");

        // How can i add element in ArrayList
        int [] arr1 = new int [3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        System.out.println("--------------------------------");
        // .add(Element/Data)
        arrList3.add(10);
        System.out.println(arrList3); // [10]
        System.out.println(arrList3.size()); // 1 - mean one element in arrList3

        arrList3.add(20);
        System.out.println(arrList3); //[10, 20]

        arrList3.add(30);
        System.out.println(arrList3); // [10, 20, 30
        System.out.println("-------------------------------");

        // How can i get element?
        // .get(index)
        System.out.println(arrList3.get(0)); // 10
        System.out.println(arrList3.get(1)); // 20
        System.out.println(arrList3.get(2)); // 30

        //    INDEX                       0    1   2

        System.out.println("----------------------------------------------------------------------------");
        // How can I get the element
        // .get(index);
        System.out.println( arrList3.get(0) );
        System.out.println( arrList3.get(1) );
        System.out.println( arrList3.get(2) );
        //System.out.println( arrList3.get(3) ); // IndexOutOfBoundsException - because I do not have element at that index. Because the current size 3 (last index is 2)


        System.out.println("----------------------------------------------------------------------------");
        // How can I add the element on the EXACT index - Ex: add -10 at index 1
        // [10, 20, 30]
        //  0   1   2
        // .add(index, Element/Data); -- > adds the given Element to the given index inside of the list and pushes all other to right side
        arrList3.add(1, -10);
        // [10, -10, 20, 30]
        //   0   1   2    3
        System.out.println(arrList3);
        System.out.println(arrList3.size());

        System.out.println("----------------------------------------------------------------------------");
        // Can you get me the last element in ArrayList of Integer
        System.out.println( arrList3.get( arrList3.size() - 1 ) );

        // Can you get me the first element in ArrayList of Integer
        System.out.println( arrList3.get( 0 ) );

        arrList3.add( (int)23.7 );  // double -- > int ---- > AUTOBOXING --- > Integer
        System.out.println(arrList3);

    }





}
