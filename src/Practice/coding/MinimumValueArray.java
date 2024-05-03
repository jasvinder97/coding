package Practice.coding;

public class MinimumValueArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9, 11, 13, 12, 16, 7};
        ReverseArray.printArray(array);
        System.out.println("Minimum Value" + findMinimum(array));

    }

    static int findMinimum(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
