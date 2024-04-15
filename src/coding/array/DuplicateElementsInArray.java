package coding.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 2, 3, 1, 6, 5};
        Integer[] result = checkDuplicates(input);
        for (Integer integer : result) {
            System.out.println("Duplicate element " + integer);
        }
    }

    static Integer[] checkDuplicates(int[] input) {
        Set<Integer> set = new HashSet<>();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (set.contains(input[i])) {
                integers.add(input[i]);
            } else
                set.add(input[i]);
        }
        return integers.toArray(new Integer[0]);
    }
}
