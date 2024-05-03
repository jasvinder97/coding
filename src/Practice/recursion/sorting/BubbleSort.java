package Practice.recursion.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = bubbleSort(new int[]{4, 3, 7, 9, 1, 54, 65, 32, 34, 11, 22, 16, 87});
        Arrays.stream(a).forEach(System.out::println);
    }

    static int[] bubbleSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
}
