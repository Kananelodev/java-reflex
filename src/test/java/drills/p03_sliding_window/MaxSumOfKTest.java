package drills.p03_sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MaxSumOfKTest {

    @Test void basic() { assertEquals(39, MaxSumOfK.maxSumOfK(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4)); }
    @Test void allNegative() { assertEquals(-3, MaxSumOfK.maxSumOfK(new int[]{-1, -2, -3}, 2)); }
    @Test void kEqualsN() { assertEquals(6, MaxSumOfK.maxSumOfK(new int[]{1, 2, 3}, 3)); }
    @Test void largeAndOverflow() {
        int[] a = new int[1_000_000];
        Arrays.fill(a, 1_000_000_000);
        assertEquals(500_000L * 1_000_000_000L, MaxSumOfK.maxSumOfK(a, 500_000));
    }
}
