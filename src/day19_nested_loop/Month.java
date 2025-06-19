package day19_nested_loop;
/*
    1 month - 4 weeks.
                each week we 7 days


    Week 1
        Day 1
        Day 2
        Day 3
        Day 4
        Day 5
        Day 6
        Day 7

    Week 2
        Day 1
        Day 2
        ...
        Day 6
        Day 7

 */
public class Month {
    public static void main(String[] args) {
        // outer loop = 4x
        for (int i = 1; i <= 4; i++) {
            System.out.println("\tWeek " + i);

            // Inner loop = 7x
            for (int j = 1; j <= 7; j++) {
                System.out.println("\tDay " + j);
            }

        }





    }
}
