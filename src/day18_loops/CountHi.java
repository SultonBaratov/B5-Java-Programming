package day18_loops;

public class CountHi {
    public static void main(String[] args) {

        String str = "asdsjhidslfkhidsfjshidfoisdfj";
        String hi = "hi";
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++){
            String every2Char = "" + str.charAt(i) + str.charAt(i+1);
            if (every2Char.equals("hi")){
                count++;
            }

        }
        System.out.println("There are " + count + " 'hi'");




    }
}
