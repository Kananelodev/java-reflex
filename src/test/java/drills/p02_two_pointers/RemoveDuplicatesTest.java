package drills.p02_two_pointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RemoveDuplicatesTest {

    static void check(int[] nums, int[] expected) {
        int k = RemoveDuplicates.removeDuplicates(nums);
        assertEquals(expected.length, k);
        assertArrayEquals(expected, Arrays.copyOf(nums, k));
    }
    @Test void small() { check(new int[]{1, 1, 2}, new int[]{1, 2}); }
    @Test void longer() { check(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[]{0, 1, 2, 3, 4}); }
    @Test void empty() { check(new int[0], new int[0]); }
    @Test void single() { check(new int[]{7}, new int[]{7}); }
    @Test void negatives() { check(new int[]{-3, -3, -1, 0, 0}, new int[]{-3, -1, 0}); }
}
