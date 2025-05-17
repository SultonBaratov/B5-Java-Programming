package day05_variables;

public class CharExample {
    public static void main(String[] args) {
        // declare "char data type variable and assign a value
        char letter1 = 'a';
        char letter2 = 'z';
        char letter3 = '$';
        char letter4 = '9';

        // char letter5 = 'AB' it give error because char can contain single letter
        // char letter6 = "A" it also give error because for char you can use only 'Single Quote'

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);

        System.out.println(letter1 + letter2); // a is 97 + z is 90
        // the result would be 187 that is 97+90
    }
}
