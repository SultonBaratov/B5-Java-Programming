package day07_relational_operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // 5 > 2; ==> Correct / True / Right
        // 2 > 5; ==> Incorrect / False / Wrong

        System.out.println(5 > 2); // Hardcoded
        System.out.println(2 > 5);
        System.out.println();

        int a = 5;
        int b = 2;
        System.out.println(a > b); // Dynamic
        System.out.println(b > a);
        System.out.println();


        System.out.println("-----------------------------");
        int j = 30;
        int i = 45;
        System.out.println(i < j); // less than = so it is false
        System.out.println(j <= i); // less than or equal = so answer is true
        System.out.println();

        System.out.println(4 == 4); //True = they are equal
        System.out.println(4 == 5); // False = 5 bigger than 4
        System.out.println();

        // ! --> is not operator
        System.out.println(4 != 4); //False = because 4 is equal 4
        System.out.println(4 != 5); // True = because they are not equal
        System.out.println(-4 != 4); // True = because they are not equal



    }
}
