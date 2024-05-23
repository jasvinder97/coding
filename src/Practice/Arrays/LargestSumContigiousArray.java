package Practice.Arrays;

public class LargestSumContigiousArray {

//    kadane algo

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,1,-9,-9};
        System.out.println(sumOfSubArray(array));
    }

    static long sumOfSubArray(int[] a) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxi;
    }
}
