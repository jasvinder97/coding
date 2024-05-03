package Practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArraySearch {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        matrix.add(new ArrayList<>(Arrays.asList(5, 6, 7, 8)));
        matrix.add(new ArrayList<>(Arrays.asList(9, 10, 11, 12)));
        System.out.println(search(matrix, 12));
    }

    static boolean search(ArrayList<ArrayList<Integer>> matrix, int target) {
        int n = matrix.size();
        int m = matrix.get(0).size();
        int low = 0;
        int high = (n * m) - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m;
            int col = mid % m;
            if (matrix.get(row).get(col) == target) {
                return true;
            } else if (matrix.get(row).get(col) < target) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return false;
    }
}
