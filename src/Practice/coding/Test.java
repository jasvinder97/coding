package Practice.coding;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9, 11,11, 13, 12, 16, 7};
        System.out.println(twoSumProblem(array, 23));
    }



    static String twoSumProblem(int[] a, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int r = target - a[i];
            if (map.containsKey(r)) {
                System.out.println(r);
                System.out.println(a[i]);
            }
            map.put(a[i], i);
        }
        return "";
    }

    static Integer largestElement(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    static Integer secondLargest(int[] a) {
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
