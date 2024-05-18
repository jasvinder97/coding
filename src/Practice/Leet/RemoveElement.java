package Practice.Leet;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5, 6, 7, 8, 65};
        System.out.println(removeDuplicateFromArray(a));
    }

    static int removeElement(int[] a, int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != target) {
                a[count] = a[i];
                count++;
            }
        }
        return count;
    }

    //sorted array in non descreasing
    static int removeDuplicateFromArray(int[] a) {
        int j = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[j] = a[i];
                j++;
            }
        }
        return j;
    }
}
