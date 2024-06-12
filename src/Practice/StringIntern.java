package Practice;

import java.util.Stack;

public class StringIntern {

    public static void main(String[] args) {
        String s = "hello";
        String s2 = "hello".intern();
        System.out.println(s == s2);

        Stack<Integer> digits = new Stack<>();
        int n = 98913;
        while (n > 0) {
            digits.push(n % 10);
            n = n / 10;
        }

        digits.elements().asIterator().forEachRemaining(System.out::println);
    }
}
