package recursion.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = insertionSort(new int[]{4, 3, 7, 9, 1, 54, 65, 32, 34, 11, 22, 16, 87});
        Arrays.stream(a).forEach(System.out::println);
    }

    static int[] insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
                j--;
            }
        }
        return a;
    }
}
