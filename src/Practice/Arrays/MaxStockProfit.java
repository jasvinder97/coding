package Practice.Arrays;

public class MaxStockProfit {
    public static void main(String[] args) {
        int[] array = {1, 2, 12, 6, 7};
        System.out.println(maxProfitOptimized(array));
    }

    static Integer maxProfit(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                max = Math.max(max, a[j] - a[i]);
            }
        }
        return max;
    }

    static Integer maxProfitOptimized(int[] a) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            max = Math.max(max, a[i] - min);
        }
        return max;
    }

}
