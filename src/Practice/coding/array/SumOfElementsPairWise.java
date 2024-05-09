package Practice.coding.array;

import java.util.HashMap;

public class SumOfElementsPairWise {
    public static void main(String[] args) {
        int[] input = new int[]{6, 8, 3, 5, 2, 1};
        System.out.println(twoSum(input, 16));
    }

    public static String twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }
            mpp.put(arr[i], i);
        }
        return "NO";
    }

    static void checkDuplicates(int[] input, int a) {
        int low = 0;
        int high = input.length - 1;
        while (low < high) {
            if (input[low] + input[high] > a) {
                high--;
            } else if (input[low] + input[high] < a) {
                low++;
            } else if (input[low] + input[high] == a) {
                System.out.println("Pair element 1: " + input[low]);
                System.out.println("Pair element 2: " + input[high]);
                low++;
                high--;
            }
        }
    }
}
