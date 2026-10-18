package drills.p04_prefix_sums;

import java.io.*;
import java.util.*;

/**
 * K14 - Find Pivot Index  [Easy, target 6 min]
 *
 * Return the leftmost index i where the sum of everything strictly left of i equals the sum of
 * everything strictly right of i, or -1. (An empty side sums to 0.)
 *
 * Example: [1, 7, 3, 6, 5, 6] -> 3; [1, 2, 3] -> -1; [2, 1, -1] -> 0
 */
public class PivotIndex {

    public static int pivotIndex(int[] nums) {
        long total = 0;
        for (int x : nums) total += x;
        long left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (left == total - left - nums[i]) return i;
            left += nums[i];
        }
        return -1;
    }
}
