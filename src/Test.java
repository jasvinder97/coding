import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        sortDigits(21134);
    }

    static void sortDigits(Integer n) {
        Map<Integer, Integer> map = new HashMap<>();
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            if (map.containsKey(digit)) {
                map.put(digit, map.get(digit) + 1);
            } else {
                map.put(digit, 1);
            }
        }

        for (int i = 0; i <= 9; ) {
            if (map.containsKey(i) && map.get(i) > 0) {
                System.out.println(i);
                map.put(i, map.get(i) - 1);
            } else {
                i++;
            }
        }


    }


}

