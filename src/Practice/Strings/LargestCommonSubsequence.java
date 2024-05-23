package Practice.Strings;

import java.util.Arrays;

public class LargestCommonSubsequence {
    public static void main(String[] args) {
        System.out.println(lCS("acd","ced"));
    }
//    Dynamic Programming 1

    static int lCS(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return util(s1, s2, n - 1, m - 1, dp);
    }

    static int util(String s1, String s2, int ind1, int ind2, int[][] dp) {
        if (ind1 < 0 || ind2 < 0) {
            return 0;
        }
        if (dp[ind1][ind2] != -1) {
            return dp[ind1][ind2];
        }
        if (s1.charAt(ind1) == s2.charAt(ind2)) {
            return dp[ind1][ind2] = 1 + util(s1, s2, ind1 - 1, ind2 - 1, dp);
        } else
            return dp[ind1][ind2] = Math.max(util(s1, s2, ind1, ind2 - 1, dp), util(s1, s2, ind1 - 1, ind2, dp));
    }
}
