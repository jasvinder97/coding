package Practice.Leet;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 4, 5};
        merge(a, 3, b, 3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void merge(int[] a, int m, int[] b, int n) {
        for (int i = m, j = 0; j < n; j++) {
            a[i] = b[j];
            i++;
        }
        Arrays.sort(a);
    }
}
