package drills.p04_prefix_sums;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SubarraySumEqualsKTest {

    @Test void ones() { assertEquals(2, SubarraySumEqualsK.subarraySum(new int[]{1, 1, 1}, 2)); }
    @Test void basic() { assertEquals(2, SubarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 3)); }
    @Test void negatives() { assertEquals(3, SubarraySumEqualsK.subarraySum(new int[]{1, -1, 0}, 0)); }
    @Test void none() { assertEquals(0, SubarraySumEqualsK.subarraySum(new int[]{1, 2, 3}, 7)); }
    @Test void largeAllZeros() {
        assertEquals(200_000L * 200_001L / 2, SubarraySumEqualsK.subarraySum(new int[200_000], 0));
    }
}
