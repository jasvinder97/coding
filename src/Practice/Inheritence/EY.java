package Practice.Inheritence;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EY {
//    [1,2,3,3]  == true
//    [1,2,3] == false


    public static void main(String[] args) {
//        int[] a = {1, 2, 3};
//        System.out.println(test(a));
        Integer[] a = {10, 15, 8, 49, 25, 98, 98, 32, 15};
        List<Integer> intList = Arrays.asList(a).stream().sorted((o1, o2) -> {
            if (o2 > o1) {
                return 1;
            } else
                return -1;
        }).collect(Collectors.toList());

        Arrays.asList(a).stream().collect(Collectors.groupingBy(integer -> integer,Collectors.counting()));

        intList.stream().forEach(integer -> System.out.println(integer));
    }

    static boolean test(int[] array) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        boolean duplicate = false;
        for (int i = 0; i < array.length; i++) {
            if (integerHashMap.containsKey(array[i])) {
                duplicate = true;
                break;
            } else {
                integerHashMap.put(array[i], 1);
            }
        }
        return duplicate;
    }

}
