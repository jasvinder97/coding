package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfLongestSubArray {
    public static void main(String[] args) {
        int[] array = {2, 0, -1, 4, 6, 8, 0, 3};
        System.out.println(getLongestSubArray(array, 11));
    }

    static int getLongestSubArray(int[] a, int k) {
        int sum = 0;
        int n = a.length;
        int maxLenght = 0;
        Map<Integer, Integer> sumIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];

            if (sum == k) {
                maxLenght = Math.max(maxLenght, i + 1);
            }

            int remaining = k - sum;

            if (sumIndexMap.containsKey(remaining)) {
                int len = i - sumIndexMap.get(remaining);
                maxLenght = Math.max(maxLenght, len);
            }
            if (!sumIndexMap.containsKey(remaining)) {
                sumIndexMap.put(sum, i);
            }
        }
        return maxLenght;
    }
}
