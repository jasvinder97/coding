package Practice.coding;


import static Practice.coding.ReverseArray.printArray;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] array = {1,0,4,6,8,0,3};
        printArray(array);
        System.out.println("Zeroes Moved");
        printArray(moveZeroes(array));
    }

    static int[] moveZeroes(int[] input) {
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0 && input[j] == 0) {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
            if (input[j] != 0) {
                j++;
            }
        }
        return input;
    }
}
