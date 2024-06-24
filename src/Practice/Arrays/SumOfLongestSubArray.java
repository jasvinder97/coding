package Practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfLongestSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, -3, 2, 1};
        System.out.println(getSubArraysWithSum(array, 5));
    }

    static int getSubArraysWithSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize with a sum of 0 at index -1 (before the array starts)
        map.put(0, 1);

        int cumulativeSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            // Update cumulative sum
            cumulativeSum += arr[i];

            // Check if there is a cumulative sum that equals current sum - target
            int complement = cumulativeSum - target;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }

            // Store the cumulative sum in the map
            map.put(cumulativeSum, map.getOrDefault(cumulativeSum, 0) + 1);
        }

        return count;
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
