package Practice.coding;


import java.util.Arrays;

import static Practice.coding.ReverseArray.printArray;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 6, 8, 0, 3};
        printArray(array);
        System.out.println("Zeroes Moved");
        printArray(evenPositionGreater(array));
    }

    static int[] moveZeroes(int[] a) {
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

    static int[] evenPositionGreater(int[] a) {
        Arrays.sort(a);
        int[] ans = new int[a.length];
        int evenPtr = a.length - 1;
        int oddPtr = 0;
        for (int i = 0; i < a.length-1; i++) {
            if (i % 2 == 0) {
                ans[i] = a[evenPtr--];
            } else {
                ans[i] = a[oddPtr++];
            }
        }
        return ans;
    }
}
