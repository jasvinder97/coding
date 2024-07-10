public class FridayTest {
    public static void main(String[] args) {
        //  array 0, 1, 2 [0,0,1,0,2,1] --- [0,0,0,1,1,2]
        int[] a = {0, 0, 1, 2, 1, 0,2};
        int[] b = rearrangeNumbers(a);
        /*Arrays.asList(b).stream().sorted((o1, o2) -> {
            if (o2 > o1) return -1;
            else return 1;
        }).forEach(System.out::println);*/
        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

    }

    static int[] rearrangeNumbers(int[] a) {
        int n = a.length;
        int[] result = new int[n];

        int numberOfZeros = 0;
        int numberOfOnes = 0;
        int numberOfTwos = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                numberOfZeros++;
            }
            if (a[i] == 1) {
                numberOfOnes++;
            }
            if (a[i] == 2) {
                numberOfTwos++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (i <= numberOfZeros - 1) {
                result[i] = 0;
            }
            if (i >= numberOfZeros && i < numberOfOnes + numberOfZeros) {
                result[i] = 1;
            }
            if (i >= numberOfOnes + numberOfZeros && i < numberOfTwos+numberOfZeros+numberOfOnes) {
                result[i] = 2;

            }
        }

        return result;
    }
}
