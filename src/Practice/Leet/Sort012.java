package Practice.Leet;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int n = 6;
        int[] a = {0, 2, 1, 2, 0, 1};
        sortArray(a, n);
        System.out.println("After sorting:");
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void sortArray(int[] a, int n) {
        int low = 0, mid = 0, high = n - 1; // 3 pointers
        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }


}
