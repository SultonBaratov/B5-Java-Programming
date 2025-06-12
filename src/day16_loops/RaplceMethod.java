package day16_loops;

public class RaplceMethod {
    public static void main(String[] args) {

        String str = "java is a fun coding language";

        System.out.println("Before .replace(): " + str);
        str = str.replace('a', 'e'); // Find all 'a' and replace with 'e'
        System.out.println("After .replace(): " +str);

        System.out.println("--------------------------------------");
        str = str.replace("jeve", "Intellije");
        System.out.println("After, after .replace(): " + str);

        String str2 = "Today is Wednesday. Wednesday is a fun day because on Wednesday we have Java classes.";
        str2 = str2.replace("Wednesday", "Whursday");
        System.out.println("After .replace(): " + str2);


        System.out.println("---------------------------------"); // This method is .replaceFirst() - it only change first one
        String sentence2 = "Today is Wednesday. Wednesday is a fun day because on Wednesday we have Java classes.";
        sentence2 = sentence2.replaceFirst("Wednesday", "Thursday");
        System.out.println("After .replaceFirst(): " + sentence2);




    }

}
