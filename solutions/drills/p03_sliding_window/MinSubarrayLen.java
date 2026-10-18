package drills.p03_sliding_window;

import java.io.*;
import java.util.*;

/**
 * K11 - Minimum Size Subarray Sum  [Medium, target 10 min]
 *
 * All numbers are positive. Return the length of the shortest contiguous subarray whose sum is
 * >= target, or 0 if there is none. Must be O(n): one test has 1,000,000 numbers.
 *
 * Example: target 7, [2, 3, 1, 2, 4, 3] -> 2 ([4, 3])
 */
public class MinSubarrayLen {

    public static int minSubArrayLen(int target, int[] nums) {
        int best = Integer.MAX_VALUE, left = 0;
        long sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                best = Math.min(best, right - left + 1);
                sum -= nums[left++];
            }
        }
        return best == Integer.MAX_VALUE ? 0 : best;
    }
}
