package drills.p01_hashing;

import java.io.*;
import java.util.*;

/**
 * K02 - Two Sum (unsorted)  [Easy, target 6 min]
 *
 * nums is NOT sorted. Exactly one pair of different indices i < j has nums[i] + nums[j] == target.
 * Return {i, j} with i < j. Must be O(n) - the last test has 200,000 numbers.
 *
 * Example: [2, 7, 11, 15], target 9 -> {0, 1}
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = seen.get(target - nums[i]);
            if (j != null) return new int[]{j, i};
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
