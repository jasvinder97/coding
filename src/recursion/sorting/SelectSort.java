package recursion.sorting;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] a = selectionSort(new int[]{4, 3, 7, 9, 1, 54, 65, 32, 34, 11, 22, 16, 87});
        Arrays.stream(a).forEach(System.out::println);
    }


    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
