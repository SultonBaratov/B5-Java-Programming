package day06_a_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {
        int num1 = 40;
        //float num2 = num1
        float num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 50.5f;
        short num4 = (short)num3;
        System.out.println(num3); //50.5 (because float is decimal number)
        System.out.println(num4); //50 (short is whole number)

        char letter1 = 'f';
        int letterInt = letter1;
        System.out.println(letter1);
        System.out.println(letterInt);
    }
}
