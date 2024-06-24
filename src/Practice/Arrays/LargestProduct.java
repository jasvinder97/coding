package Practice.Arrays;

public class LargestProduct {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 0, -4, -5};
        System.out.println(maxProduct(array));
    }

// using two pointers
    static Integer maxProduct(int[] a) {
        int n = a.length;
        int pre = 1;
        int post = 1;
        int product = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) {
                pre = 1;
            }
            if (post == 0) {
                post = 1;
            }
            pre = pre * a[i];

            post = post * a[n - 1 - i];
            product = Math.max(product, Math.max(pre, post));
        }
        return product;
    }
}
