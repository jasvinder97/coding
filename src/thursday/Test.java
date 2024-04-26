package thursday;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {


        int[] a = {1, 0, 0, 2, 1, 3, 4, 3, 5};


    }


    public static int getLongestSubarray(int[] a, long k) {
        int n = a.length; // size of the array.

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    private static void rotateByOne(int[] a, Stack<Integer> shifted) {
        for (int i = 0; i < a.length - 1; i++) {
            if (i < 1) {
                shifted.push(a[i]);
            }
            a[i] = a[i + 1];
        }
        for (int j = a.length - 1; j > a.length - 1 - 1; j--) {
            a[j] = shifted.pop();
        }
    }

    static void removeDuplicates(int[] arr) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
    }

    private static boolean checkIfSorted(int[] a) {
        boolean isAscOrder = true;
        for (int i = 1; i < a.length; i++) {
            if (!(a[i] > a[i - 1])) {
                isAscOrder = false;
                break;
            }
        }
        return isAscOrder;
    }

    private static int getSecMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secMax = max;
                max = a[i];
            }
            if (max > a[i] && a[i] > secMax) {
                secMax = a[i];
            }
        }
        return secMax;
    }

}
