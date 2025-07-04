package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println( sumOfElems(nums));
        System.out.println(sumOfElems(new int[] {23, 45, 23}));
        System.out.println("------------------------");
        System.out.println(sumOfElems2(nums));
        System.out.println(sumOfElems2());
    }

    public static int sumOfElems (int [] arr){
        int result = 0;

        for (int eachElem : arr){
            result += eachElem;
        }

        return result;
    }

    // var args
    public static int sumOfElems2 (int ... arr) {
        int result = 0;

        for (int eachElem : arr) {
            result += eachElem;
        }

        return result;

    }
}
