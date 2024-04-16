package Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] array = {1, 2, 99, 817, 3, 5, 6, 8, 9, 11, 13, 12, 16, 7};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

}
