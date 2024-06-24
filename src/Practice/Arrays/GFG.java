package Practice.Arrays;


class GFG {
    public static int longestUniqueSubsttr(String str) {
        // if string length is 0
        if (str.length() == 0)
            return 0;

        // if string length 1
        if (str.length() == 1)
            return 1;

        // if string length is more than 2
        int maxLength = 0;
        boolean[] visited = new boolean[256];

        // left and right pointer of sliding window
        int left = 0, right = 0;
        while (right < str.length()) {

            // if character is visited
            if (visited[str.charAt(right)]) {

                // The left pointer moves to the right while
                // marking visited characters as false until
                // the repeating character is no longer part
                // of the current window.
                while (visited[str.charAt(right)]) {

                    visited[str.charAt(left)] = false;
                    left++;
                }
            }

            visited[str.charAt(right)] = true;

            // The length of the current window (right -
            // left + 1) is calculated and answer is updated
            // accordingly.
            maxLength
                    = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("The input string is " + str);

        int len = longestUniqueSubsttr(str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len);
    }
}
