package drills.p03_sliding_window;

import java.io.*;
import java.util.*;

/**
 * K09 - Max Sum of k Consecutive  [Easy, target 6 min]
 *
 * Return the maximum sum of any k consecutive elements (1 <= k <= n). Return a long.
 * Must be O(n): one test has n = 1,000,000 and k = 500,000.
 *
 * Example: [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4 -> 39
 */
public class MaxSumOfK {

    public static long maxSumOfK(int[] a, int k) {
        long window = 0;
        for (int i = 0; i < k; i++) window += a[i];
        long best = window;
        for (int i = k; i < a.length; i++) {
            window += a[i] - a[i - k];
            best = Math.max(best, window);
        }
        return best;
    }
}
