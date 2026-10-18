package drills.p01_hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TwoSumTest {

    @Test void basic() { assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9)); }
    @Test void notFirst() { assertArrayEquals(new int[]{1, 2}, TwoSum.twoSum(new int[]{3, 2, 4}, 6)); }
    @Test void sameValue() { assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3, 3}, 6)); }
    @Test void negatives() { assertArrayEquals(new int[]{2, 4}, TwoSum.twoSum(new int[]{-1, -2, -3, -4, -5}, -8)); }
    @Test void large() {
        int n = 200_000;
        int[] nums = new int[n];
        for (int i = 0; i < n - 2; i++) nums[i] = 2 * i;
        nums[n - 2] = 1_000_001; nums[n - 1] = 1_000_003;
        assertArrayEquals(new int[]{n - 2, n - 1}, TwoSum.twoSum(nums, 2_000_004));
    }
}
