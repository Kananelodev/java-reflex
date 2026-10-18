package drills.p09_dp;

import java.io.*;
import java.util.*;

/**
 * K36 - Longest Common Subsequence  [Medium, target 15 min]
 *
 * Return the length of the longest subsequence common to a and b (characters in order, not
 * necessarily contiguous). One test has two strings of length 3,000.
 *
 * Example: ("abcde", "ace") -> 3
 * Hint: dp[i][j] = LCS of the first i chars of a and the first j chars of b.
 */
public class LongestCommonSubsequence {

    public static int lcs(String a, String b) {
        int n = a.length(), m = b.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                dp[i][j] = a.charAt(i - 1) == b.charAt(j - 1) ? dp[i - 1][j - 1] + 1
                                                            : Math.max(dp[i - 1][j], dp[i][j - 1]);
        return dp[n][m];
    }
}
