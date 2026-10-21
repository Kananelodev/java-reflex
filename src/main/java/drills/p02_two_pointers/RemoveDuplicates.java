package drills.p02_two_pointers;

import java.util.Arrays;

/**
 * K06 - Remove Duplicates from Sorted Array  [Easy, target 6 min]
 *
 * nums is sorted ascending. Remove duplicates IN PLACE so each value appears once in the first k
 * positions (in order), and return k. What is left after position k does not matter.
 *
 * Example: [0,0,1,1,1,2,2,3,3,4] -> k = 5, nums starts with [0,1,2,3,4]
 */
public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        // TODO

        int right = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[right] = nums[i];
                right++;
            }
        }
        return Arrays.copyOf(nums, right);
    }
}
