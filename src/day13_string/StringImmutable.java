package day13_string;

public class StringImmutable {
    public static void main (String [] args) {

        String str1 = "loop";
        String str2 = "loop";

        System.out.println(str1);
        System.out.println(str2);

        str1 = str1 + "camp"; // "loop" + "camp" = "loopcamp"


        System.out.println(str1); //

        String str3 = new String("loop"); // both method is same, its just different way to write String
        String str4 = new String("loop");
        str3 = str3 + "camp";
        System.out.println(str3);

    }
}
