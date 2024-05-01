package Arrays;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] array = {10, 3, 8, 14, 19, 2};
        System.out.println(MaxStockIncreaseSpan(array));
    }

    static int MaxStockIncreaseSpan(int[] a) {
        Stack<Integer> s = new Stack<>();

        int spanMax = 1;
        int span = 1;
        for (int i = 0; i < a.length; i++) {

            if (!s.isEmpty() && s.peek() <= a[i]) {
                span = span + 1;

            } else if (!s.isEmpty() && s.peek() > a[i]) {
                span = 1;
            }
            s.push(a[i]);
            spanMax = Math.max(spanMax, span);
        }
        return spanMax;
    }
}
