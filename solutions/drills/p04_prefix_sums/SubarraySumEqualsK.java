package drills.p04_prefix_sums;

import java.io.*;
import java.util.*;

/**
 * K15 - Subarray Sum Equals K  [Medium, target 12 min]
 *
 * Return how many contiguous subarrays sum to exactly k. Numbers can be negative, so a sliding
 * window does NOT work. Return a long - the answer can exceed the int range.
 * Must be O(n): one test has 200,000 numbers.
 *
 * Example: [1, 1, 1], k = 2 -> 2; [1, -1, 0], k = 0 -> 3
 * Hint: prefix sums + a HashMap counting how often each prefix sum has appeared.
 */
public class SubarraySumEqualsK {

    public static long subarraySum(int[] nums, int k) {
        Map<Long, Integer> seen = new HashMap<>();
        seen.put(0L, 1);
        long sum = 0, count = 0;
        for (int x : nums) {
            sum += x;
            count += seen.getOrDefault(sum - k, 0);
            seen.merge(sum, 1, Integer::sum);
        }
        return count;
    }
}
