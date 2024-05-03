package Practice.coding;


public class Sorting {

    public static void main(String[] args) {
        int[] array = new int[]{1, 98, 32, 9, 23, 13, 6};
        array = bubbleSort(array);
        reArrangeInNumericalOrder("8391125");
    }

    protected static int[] bubbleSort(int[] unsortedArray) {
        int size = unsortedArray.length;
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }

    protected static int[] selectionSort(int[] unsortedArray) {
        int size = unsortedArray.length;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < unsortedArray[min]) {
                    min = j;
                }
            }
            int temp = unsortedArray[min];
            unsortedArray[min] = unsortedArray[i];
            unsortedArray[i] = temp;
        }
        return unsortedArray;
    }

    protected static void reArrangeInNumericalOrder(String s) {
        int size = s.length();
        StringBuilder builder = new StringBuilder();
        char[] array = s.toCharArray();
        for (int i = 0; i < size; i++) {

            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;

                }
            }
            char temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            builder.append(temp);
        }

    }
}
