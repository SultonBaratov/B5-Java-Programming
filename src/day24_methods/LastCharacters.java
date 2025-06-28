package day24_methods;
/*
    Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

    Ex:

        {"James", "is", "back"}
        {"he", "was", "never", "gone"}
        {"methods", "tomorrow"}

    Output:
        ssk
        esre
        sw

 */
public class LastCharacters {
    public static void main(String[] args) {

        String [][] words = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}

        };

        for (String[] eachArrays : words){
            String lastChar = "";
            for (String eachArr : eachArrays){
                /*
            Loop and get each single D array
                loop and get each elem
                    char var - > charAt(lastChar)
                print
         */
                char lastLetterOfEachArr = eachArr.charAt(eachArr.length() - 1);
                lastChar += lastLetterOfEachArr;
            }
            System.out.println(lastChar);
        }

    }
}
