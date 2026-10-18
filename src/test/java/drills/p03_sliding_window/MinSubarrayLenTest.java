package drills.p03_sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MinSubarrayLenTest {

    @Test void basic() { assertEquals(2, MinSubarrayLen.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3})); }
    @Test void single() { assertEquals(1, MinSubarrayLen.minSubArrayLen(4, new int[]{1, 4, 4})); }
    @Test void none() { assertEquals(0, MinSubarrayLen.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1})); }
    @Test void whole() { assertEquals(5, MinSubarrayLen.minSubArrayLen(15, new int[]{1, 2, 3, 4, 5})); }
    @Test void large() {
        int[] a = new int[1_000_000];
        Arrays.fill(a, 1);
        assertEquals(1_000_000, MinSubarrayLen.minSubArrayLen(1_000_000, a));
    }
}
