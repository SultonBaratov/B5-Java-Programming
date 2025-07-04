package day26_methods;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6};

        int [] nums2 = addElem(nums, 89);
        System.out.println(Arrays.toString(nums2));
    }
    // Create a method which adds a given numebr into an array
    public static int [] addElem (int [] nums, int num){

        int [] newNums = Arrays.copyOf(nums, nums.length+1);
        newNums[newNums.length-1] = num;

        return newNums;
    }

    public static int [] addElem2 (int num, int ... nums){

        int [] newNums = Arrays.copyOf(nums, nums.length+1);
        newNums[newNums.length-1] = num;

        return newNums;
    }


}
