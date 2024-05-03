package Practice.coding.array;

public class SumOfElementsPairWise {
    public static void main(String[] args) {
        int[] input = new int[]{1, 3, 7, 8, 9, 10, 11, 14, 16, 19};
        checkDuplicates(input, 10);
    }

    static void checkDuplicates(int[] input, int a) {
        int low = 0;
        int high = input.length - 1;
        while (low < high) {
            if (input[low] + input[high] > a) {
                high--;
            } else if (input[low] + input[high] < a) {
                low++;
            } else if (input[low] + input[high] == a) {
                System.out.println("Pair element 1: " + input[low]);
                System.out.println("Pair element 2: " + input[high]);
                low++;
                high--;
            }
        }
    }
}
