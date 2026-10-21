package drills.p02_two_pointers;

import java.util.Arrays;

/**
 * K07 - 3Sum  [Medium, target 15 min]
 *
 * Return every unique triplet [a, b, c] of values from nums (different indices) with a + b + c == 0.
 * No duplicate triplets. Order of triplets / order inside a triplet does not matter.
 * Must be O(n^2): one test has 3,000 numbers.
 *
 * Example: [-1, 0, 1, 2, -1, -4] -> [[-1, -1, 2], [-1, 0, 1]]
 * Hint: sort, fix the first value, two-pointer the rest, skip repeated values.
 */
public class ThreeSum {

    public static int[] threeSum(int[] nums, int target) {
        
        Arrays.sort(nums);

        int first = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int left = nums[i];
            int right = nums[i + 1];

            if(left != right) {
                int sum = left + right + first;

                if(sum == 0) {
                    
                }

            }
        }
        return null;
    }
};



