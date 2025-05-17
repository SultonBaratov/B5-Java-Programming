package day06_a_arithmetic_operators;

public class BasicCalculator {
    public static void main(String[] args) {

        double num1 = 7; //7.0
        double num3 = 5;

        double additionResult = num1+num3;
        double subtractionResult = num1-num3;
        double multiplicationResult = num1*num3;
        double divisionResult = num1/num3;

        System.out.println(num1 + " + " + num3 + " = " + additionResult);
        System.out.println(num1 + " - " + num3 + " = " + subtractionResult);
        System.out.println(num1 + " - " + num3 + " = " + subtractionResult);
        System.out.println(num1 + " * " + num3 + " = " + multiplicationResult);
        System.out.println(num1 + " / " + num3 + " = " + divisionResult);

        System.out.println("---------------------------");

        int num4 = 7;
        int num6 = 5;

        int additionResult2 = num6 + num6;
        int subtractionResult3 = num6 - num6;
        int subtractionResult4 = num6 - num6;
        int multiplicationResult2 = num6 * num6;
        int divisionResult2 = num6 / num6;
        int remainderResult2 = num6 % num6;

        System.out.println(num6 + " + " + num6 + " = " + additionResult2);
        System.out.println(num6 + " - " + num6 + " = " + subtractionResult3);
        System.out.println(num6 + " - " + num6 + " = " + subtractionResult4);
        System.out.println(num6 + " * " + num6 + " = " + multiplicationResult2);

        System.out.println(num6 + " / " + num6 + " = " + divisionResult2);
        System.out.println(num6 + " % " + num6 + " = " + remainderResult2);


        System.out.println("---------------------------");
        System.out.println(3.2 + 1); // double + int --- > CASTING will always pick the bigger --> 4.2

        int a = 3;
        double d = 4;  // 4.0
        double result = a + d; // int + double--- > double
        System.out.println(result); // 7.0


        int a2 = 3;
        double d2 = 4;  // 4.0
        //int result2 = (int)a2 + d2; // int + double--- > double --> cast it into int so result2 can hold it.
        int result2 = (int)(a2 + d2); // int + double--- > double --> cast total into int so result2 can hold it.
        System.out.println(result2); // 7.0


        short s = 10;
        int i = 20;
        System.out.println(s * i); // short * int -- > int

        double d3 = 10.5;
        float f = 20.5f;
        float result3 = (float)(d3 - f);  // double - float ---- > double
        System.out.println(result3);


        System.out.println("-------------------");
        byte b5 = 2;
        short s5 = 3;
        short res = (short)(b5 + s5); // byte and short --- >  int
        System.out.println(res);

        System.out.println(b5 + s5); // byte + short --- > short --- >  int


        /*
            byte and short --- > int
            byte and byte ---- > int
            short and short -- > int


            byte and int ----- > int
            short and int ---- > int
            int and int ------ > int

            float and int ---- > float;
           float and double -- > double

         */


    }
}
