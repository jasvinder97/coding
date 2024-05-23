package Practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class TestAccolite {
    public static void main(String[] args) {
        System.out.println("Is happy " + isHappy(16));
    }

    static boolean isHappy(Integer n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = digits(n);
        }

        return n == 1;
    }

    private static Integer digits(Integer a) {
        int sum = 0;
        while (a > 0) {
            int digit = (a % 10);
            sum += digit * digit;
            a = a / 10;
        }
        return sum;
    }
}
