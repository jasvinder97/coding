package Arrays;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestSubSequence {
    public static void main(String[] args) {
        int[] array = {1, 2, 99, 817, 3, 5, 6, 8, 9, 10, 11, 13, 12, 16, 7};
        System.out.println(checkSubSequence(array));
    }

    static int checkSubSequence(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hashSet.add(a[i]);
        }
        AtomicInteger longest = new AtomicInteger();

        for (int i : hashSet) {
            if (!hashSet.contains(i - 1)) {
                int len = 1;
                int x = i;
                while (hashSet.contains(x + 1)) {
                    x = x + 1;
                    len++;
                }
                longest.set(Math.max(longest.get(), len));
            }
        }


        return longest.get();

    }
}
