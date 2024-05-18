package Practice.Leet;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 7, 8};
        rotate(a, 1);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void reverse(int nums[], int i, int j) {
        int li = i;
        int ri = j;

        while (li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
}
