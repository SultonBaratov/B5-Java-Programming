package day25_methods;

public class VoidVsReturn {
    //main() --> where the execution start in Java
    public static void main(String[] args) {


    sayHi();
    }
    // Note: There 2 type of method in term of RETURN type -> 1) void return type / 2) data type return
    // Custom method - "sayHi" - it is void method in terms of return
    public static void sayHi (){
        System.out.println("Hi");
        System.out.println("---------");
        String str = "loopcamp";
        str.substring(0, 4);     // String
        str.length();            // int
        str.charAt(0);           // char
        str.equals("hi");        // Boolean
        System.out.println(str); // void
        System.out.println("--------------");
        sayHi2();
        String str2 = sayHi2();
        System.out.println(   str2  );
        System.out.println(   sayHi2()   );
    }

    // Custom method -sayhi2() - it is return type of method in terms of return -> it does the action and return string
    public static String sayHi2 (){
        String str = "Hi2";
        return str;
    }
}
