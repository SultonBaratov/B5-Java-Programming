package day15_string;

public class RemoveSpace_Trim {
    public static void main(String[] args) {

        String str = "   loopcamp     ";

        System.out.println(str);
        System.out.println(str.length());

        System.out.println("-----------------");

        System.out.println(str.trim()); // Trim remove empty space

        System.out.println("-----------------");
        String str2 = "loop camp is awesome";
        System.out.println(str2.trim());

        System.out.println("-----------------");
        String str3 = "Monday";
        System.out.println(str3.length());


    }
}
