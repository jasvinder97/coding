package Practice.Leet;


class PeakProblem {

    static int findPeak(int arr[], int n) {
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                break;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return mid;
        /*
         mid = (l + r) >> 1;

            // first case if mid is the answer
            if ((mid == 0
                 || arr[mid - 1] <= arr[mid])
                        && (mid == n - 1
                            || arr[mid + 1] <= arr[mid]))
                break;

            // move the right pointer
            if (mid > 0 && arr[mid - 1] > arr[mid])
                r = mid - 1;

            // move the left pointer
            else
                l = mid + 1;
        * */
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 20, 5, 4, 1, 55, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is "
                + findPeak(arr, n));
    }
}
