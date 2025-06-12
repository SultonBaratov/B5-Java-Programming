package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "new method";

        System.out.println(str.isEmpty());
        System.out.println(str.length() == 0);

        System.out.println("---------------");

        System.out.println(str.isBlank()); // is checks if String is only made out of "  " spaces
        System.out.println(str.length() == 0);
    }
}
