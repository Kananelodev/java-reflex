package drills.p04_prefix_sums;

import java.util.ArrayList;
import java.util.Arrays;

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
        // TODO

        ArrayList<Integer> yes = new ArrayList<>(); 
        int sumleft = 0;

        for (int i = 1; i < nums.length; i++) {
            int[] left = Arrays.copyOfRange(nums, i - 1, i);
        }
        return -2;
    }
}
