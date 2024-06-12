package Practice;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestSaturday {

    public static void main(String[] args) {
        /*
        Input: arr[] = [100, 5,5, 70,20, 2, 2,5]
        Output: [5, 2, 2, 4, 3, 1, 1]
        * */

        int[] a = {100, 5, 5, 70, 20, 2, 2, 5};
        Arrays.stream(rankers(a)).forEach(System.out::println);

    }

    static int[] rankers(int[] a) {
        int n = a.length;
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = a[i];
        }
        Arrays.sort(sorted);
        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) != n && sorted[i] != sorted[i + 1]) {
                rankMap.put(sorted[i], rank);
                rank++;
            }
        }
        rankMap.put(sorted[n - 1], rank++);
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = rankMap.get(a[i]);
        }

        return ans;

    }
}
