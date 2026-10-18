package drills.p09_dp;

import java.io.*;
import java.util.*;

/**
 * K37 - Unique Paths with Obstacles  [Medium, target 12 min]
 *
 * Move only right or down from the top-left to the bottom-right cell. 1 = obstacle, 0 = open.
 * Return the number of distinct paths (fits in an int).
 *
 * Example: [[0,0,0],[0,1,0],[0,0,0]] -> 2
 */
public class UniquePathsObstacles {

    public static int uniquePathsWithObstacles(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[] dp = new int[cols];
        dp[0] = grid[0][0] == 0 ? 1 : 0;
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) dp[c] = 0;
                else if (c > 0) dp[c] += dp[c - 1];
            }
        return dp[cols - 1];
    }
}
