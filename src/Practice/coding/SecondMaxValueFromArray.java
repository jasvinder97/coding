package Practice.coding;

public class SecondMaxValueFromArray {

    public static void main(String[] args) {
        int[] array = {-1,-3,0};
        System.out.println("2nd Max Value" + secondMax(array));

    }

    static int secondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                secMax = max;
                max = array[j];
            }
            if (array[j] > secMax && array[j] != max) {
                secMax = array[j];
            }
        }
        return secMax;
    }
}
