package day04_variables;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        // Declaring variable --> Datatype VariableName
        // If you know your container will hold WHOLE NUMBER:
        // byte
        // short
        // int
        // long

        // If you know your container will hold DECIMAL NUMBER:
        // Float
        // Double
        byte age;
        //System.out.println(age); at this line, since variable age does not have value, nothing will be printed. So it is error
        //byte age - we cannot declare same variable name in same method.
        age = 10; // in this line, we have - assign initial value
        //age = 2000 it will give a error because we assigne "byte" that range is -128 - 127

        System.out.println(age);
        System.out.println(10); // it is WHOLE NUMBER
        System.out.println("10"); // Java will understand it as a LETTER/DATA when it in double quote " "

        // Declaring variable
        int addressNumber;
        // assigning value/data into variable called addressNumber
        addressNumber = 129482;
        System.out.println(addressNumber); // int
        System.out.println(129482); // int (as default)
        System.out.println(1294268); // int (still see it as default)
        System.out.println("129482"); // it is letters and programmers call it STRING

        // Declaring variable
        long creditCardNumber;
        // assigning value / initializing variable
        //creditCardNumber = 1234567891234567l;  // Lowercase L at the end
        creditCardNumber = 1234567891234567l; //Uppercase L at the end

        System.out.println(4234567891234567L); // Since java take the data directly as "int" and since 4234567891234567 is outisde of the range that int can hold, we need to follow the syntax and add "L" or "l"

    }
}
