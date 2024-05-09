package Practice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SumOfLongestSubArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};
        System.out.println(getSubArraysWithSum(array, 7));
    }

    static int getSubArraysWithSum(int[] a, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            int remaining = k - sum;
            count += map.getOrDefault(remaining, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
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
