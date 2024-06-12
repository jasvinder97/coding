package Practice;

public class ThirdJune /*extends Thread*/ {
    public static void main(String[] args) {
        int[] a = {10, 3, 5, 6, 2, 0,0};
        long[] ans = productArray(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }


    private static int add(int a, int b) {
        return a + b;
    }

    private static boolean logic(int a, int b) {
        if (a % b == 0) {
            return true;
        } else
            return false;
    }

    //  10, 3, 5, 6, 0
    static long[] productArray(int[] a) {
        int n = a.length;
        long product = 1;
        int zerosCount = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                product *= a[i];
            } else if (a[i] == 0) {
                zerosCount++;
            }
        }
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            if (a[i] == 0 && zerosCount > 1) {
                ans[i] = 0;
            } else if (a[i] == 0 && zerosCount == 1) {
                ans[i] = product;
            } else if (zerosCount == 0) {
                ans[i] = product / a[i];
            }
        }
        return ans;
    }

    /*
    [3:27 PM] Gopalasetty Vivek
Given an array arr[] of n integers, construct a Product Array prod[] (of the same size) such that prod[i] is equal to the product of all the elements of arr[] except arr[i].
10, 3, 5, 6, 0

0,0,0,0, 900




Example :
Input: arr[]  = {10, 3, 5, 6, 2} Output: prod[]  = {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array
elements except 10 is 180
10 * 5 * 6 * 2 product of other array
elements except 3 is 600
10 * 3 * 6 * 2 product of other array
elements except 5 is 360
10 * 3 * 5 * 2 product of other array
elements except 6 is 300
10 * 3 * 6 * 5 product of other array
elements except 2 is 900
    * */
}
