package Practice.recursion;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();
        getArray(6, list);
        System.out.println(list);*/
//        printName(3, "jasvinder");
//        System.out.println(sum(4, 0));
//        System.out.println(factorial(190920D, 1D));
//        int[] original = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//        printArray(original);
//        reverse(original, 0, original.length - 1);
//        printArray(original);
//        System.out.println(palindrome("A man, a plan, a canal: Panama", 0));
//        System.out.println(fibonacci(5));
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    static void getArray(int n, List<Integer> list) {
        if (n >= 1) {
            list.add(n);
            getArray(n - 1, list);
        }

    }

    static void printName(int n, String name) {
        if (n >= 1) {
            printName(n - 1, name);
            System.out.println(name);
        }
    }

    static int sum(int n, int sum) {
        if (n >= 1) {
            sum = sum(n - 1, sum);
            sum = sum + n;
        }
        return sum;
    }

    static Double factorial(Double n, Double factorial) {
        if (n >= 1) {
            factorial = factorial(n - 1, factorial);
            factorial = factorial * n;
        }
        return factorial;
    }

    static void reverse(int[] original, int start, int last) {
        if (start < last) {
            int temp = original[last];
            original[last] = original[start];
            original[start] = temp;
            reverse(original, start + 1, last - 1);
        }
    }

    static boolean palindrome(String s, int i) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (i > s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return palindrome(s, i + 1);
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonacci(n - 1);
        int slast = fibonacci(n - 2);
        return last + slast;
    }
}
