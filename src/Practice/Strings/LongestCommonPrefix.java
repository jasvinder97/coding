package Practice.Strings;


// A Java Program to find the longest common prefix

class LongestCommonPrefix {

    // A Function to find the string having the
    // minimum length and returns that length
    static int findMinLength(String arr[], int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= (n - 1); i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        return min;
    }

    static boolean allContainsPrefix(String arr[], int n,
                                     String str, int start,
                                     int end) {
        for (int i = 0; i <= (n - 1); i++) {
            String arr_i = arr[i];

            for (int j = start; j <= end; j++)
                if (arr_i.charAt(j) != str.charAt(j))
                    return false;
        }
        return true;
    }

    // A Function that returns the longest common prefix
    // from the array of strings
    static String commonPrefix(String arr[], int n) {
        int index = findMinLength(arr, n);
        String prefix = ""; // Our resultant string
        int low = 0, high = index - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (allContainsPrefix(arr, n, arr[0], low,
                    mid)) {
                prefix = prefix
                        + arr[0].substring(low, mid + 1);

                low = mid + 1;
            } else // Go for the left part
            {
                high = mid - 1;
            }
        }

        return prefix;
    }

    // Driver program to test above function
    public static void main(String args[]) {
        String arr[] = {"geeksforgeeks", "geeks", "geek",
                "geezer"};
        int n = arr.length;

        String ans = commonPrefix(arr, n);

        if (ans.length() > 0)
            System.out.println("The longest common"
                    + " prefix is " + ans);
        else
            System.out.println("There is no common"
                    + " prefix");
    }
}

// This code is contributed by Indrajit Sinha.
