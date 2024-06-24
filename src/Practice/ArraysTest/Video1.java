package Practice.ArraysTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Video1 {
    public static void main(String[] args) {
        int[] a = {3, 1, 1, 2, 2};
//        Arrays.stream(leaders(a)).forEach(System.out::println);
//        leaders(a);
        removeDuplicates(a);
    }


    //    leaders in an array, elements at right are smaller
    static void leaders(int[] a) {
        int maxi = Integer.MIN_VALUE;
        int n = a.length;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > maxi) {
                System.out.println(a[i]);
            }
            maxi = Math.max(maxi, a[i]);
        }
    }

    //    next permutation
    static int[] nextpermutation(int[] a) {
//        step 1 find the break point
        int index = -1;
        int n = a.length;
        for (int i = n - 2; i > 0; i--) {
            if (a[i] < a[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return a;
        }
        for (int i = n - 1; i > 0; i--) {
            if (a[i] > a[index]) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
                break;
            }
        }
//        reverse
        int j = index + 1;
        int end = n - 1;
        while (j < end) {
            int temp = a[end];
            a[end] = a[j];
            a[j] = temp;
            j++;
        }
        return a;
    }

    static int[] rearrangePositiveNegative(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        int positive = 0, negative = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                ans[negative] = a[i];
                negative += 2;
            }
            if (a[i] > 0) {
                ans[positive] = a[i];
                positive += 2;
            }
        }
        return ans;
    }

//    kadane's algo

    static int maxSubArraySum(int[] a) {
        int start = -1;
        int end = -1;
        int maxi = Integer.MIN_VALUE;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (sum == 0) {
                start = i;
            }
            sum = sum + a[i];
            if (sum < 0) {
                sum = 0;

            }
            if (sum > maxi) {
                maxi = sum;
                end = i;
            }
        }
        System.out.println("Start " + start + " End " + end);
        return maxi;
    }

    static int majorityElement(int[] a) {
        int count = 0;
        int candidate = 0;
        for (int n : a) {
            if (count == 0) {
                candidate = n;
            }
            if (candidate == n) {
                count++;
            } else {
                count--;
            }
        }
        for (int n : a) {
            if (n == candidate)
                count++;
        }
        if (count > a.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }


    static int longestSubArrayWithGivenSum(int[] a, int target) {
//        will work only with positive numbers and zeros
        int left = 0, right = 0;
        int maxLen = 0;
        long sum = a[0];
        int n = a.length;
        while (right < n) {
            while (left <= right && sum > target) {
                sum = sum - a[left];
                left++;
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) {
                sum = sum + a[right];
            }
        }

        return maxLen;
    }

    static int consecutiveOnes(int[] a) {
        int max = 0, counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                counter++;
                max = Math.max(max, counter);
            } else {
                counter = 0;
            }
        }
        return max;
    }

    static int missingNumber(int[] a, int N) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < a.length; i++) {
            xor1 = a[i] ^ xor1;
            xor2 = xor2 ^ (i + 1);
        }
        xor2 = xor2 ^ N;
        return xor1 ^ xor2;
    }

    static int[] moveArraysToZero(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0 && a[j] == 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
            if (a[j] != 0) {
                j++;
            }
        }
        return a;
    }

    static int[] rotateByNumber(int[] a, int k) {
        int target = (k > a.length) ? k % a.length : k;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < target; i++) {
            integerList.add(a[i]);
        }
        for (int i = target; i < a.length; i++) {
            a[i - target] = a[i];
        }
        for (int i = a.length - target; i < a.length; i++) {
            a[i] = integerList.get(i - (a.length - target));
        }
        return a;
    }

    static int[] rotateByOne(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        return a;
    }

    static int[] removeDuplicates(int[] a) {
        int j = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[j] != a[i]) {
                a[j + 1] = a[i];
                j++;
            }
        }
        return a;
    }

    static boolean isArraySorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static int largestElement(int[] a) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            largest = Math.max(a[i], largest);
        }
        return largest;
    }

    static int secondLargestElement(int[] a) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (largest < a[i]) {
                secLargest = largest;
                largest = a[i];
            }
            if (largest > a[i] && a[i] > secLargest) {
                secLargest = a[i];
            }
        }
        return secLargest;
    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        for (int n1 : nums1
        ) {
            set1.add(n1);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int n2 : nums2
        ) {

            if (set1.contains(n2)) {
                set2.add(n2);
            }
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for (int x : set2
        ) {
            result[i] = x;
            i++;
        }

        return result;
    }
}
