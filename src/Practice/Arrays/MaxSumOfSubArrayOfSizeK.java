package Practice.Arrays;

public class MaxSumOfSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 5, 7, 4};
        System.out.println(maxSum(a, 3));
    }

    static Integer maxSum(int[] a, int k) {
        int maxSum = 0;
        int n = a.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < n) {
            sum += a[right];
            if (right - left + 1 < k) {
                right++;
            } else if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                sum -= a[left];
                left++;
                right++;
            }

        }

        return maxSum;
    }
}
