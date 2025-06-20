package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String word = "Apple";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char outLetter = word.charAt(i);

            if (unique.contains("" + outLetter)) // this is to remove duplicate


            for (int j = 0; j < word.length(); j++) {
                char innerLetter = word.charAt(j);

                if (outLetter == innerLetter){
                    count++;

                }

            }
            if (count > 1){
                System.out.println(outLetter);
            }
            if (!unique.contains("" +outLetter)){
                unique += outLetter;
            }

        }


    }
}
// todo homework -- find the unique characters (happen in the word only 1 times)