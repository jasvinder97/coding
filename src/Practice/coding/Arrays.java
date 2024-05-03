package Practice.coding;

public class Arrays {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5,6,8,9,11,13,12,16,7};
        printArray(removeEvenIntegers(array));
    }

    static void printArray(int[] inputArray) {
        int n = inputArray.length;
        for (int j : inputArray) {
            System.out.println(j);
        }
    }

    public static int[] removeEvenIntegers(int[] inputArray) {
        int oddIntegerCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                oddIntegerCount++;
            }
        }
        int[] outArray = new int[oddIntegerCount];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0) {
                outArray[j] = inputArray[i];
                j++;
            }
        }
        return outArray;
    }


}
