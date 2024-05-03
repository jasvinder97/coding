package Practice.Arrays;

public class LargestSumContigiousArray {

//    kadane algo

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,1};
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

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }
}
