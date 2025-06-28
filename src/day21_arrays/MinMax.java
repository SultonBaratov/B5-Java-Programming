package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        int maxNum = -2_147_483_648;
        int miniNum = 2_147_483_647;

        System.out.print("Please tell me how many number you want to compare: ");

        int[] nums = new int[key.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Please enter num: ");
            nums[i] = key.nextInt();
        }

        System.out.println("You array: " + Arrays.toString(nums)); // output: You array: [6, 4, 1, 23, 1]

    }
}
