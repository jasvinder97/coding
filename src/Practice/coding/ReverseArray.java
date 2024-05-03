package Practice.coding;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 8, 9, 11, 13, 12, 16, 7};
        printArray(array);
        System.out.println("Reversed");
        printArray(reverseArray(array));
    }

    static void printArray(int[] inputArray) {
        int n = inputArray.length;
        for (int j : inputArray) {
            System.out.print(j + ",");
        }
    }

    static int[] reverseArray(int[] input) {
        int start = 0;
        int end = input.length - 1;
        while (start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
        return input;
    }

}
