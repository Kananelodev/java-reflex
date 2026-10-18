package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PrefixSumsTest {

    @Test void basic() {
        long[] pre = PrefixSums.prefix(new int[]{3, 1, 4, 1, 5});
        assertArrayEquals(new long[]{0, 3, 4, 8, 9, 14}, pre);
        assertEquals(6, PrefixSums.rangeSum(pre, 1, 3));
        assertEquals(3, PrefixSums.rangeSum(pre, 0, 0));
        assertEquals(14, PrefixSums.rangeSum(pre, 0, 4));
    }
    @Test void overflow() {
        long[] pre = PrefixSums.prefix(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE});
        assertEquals(4294967294L, PrefixSums.rangeSum(pre, 0, 1));
    }
    @Test void empty() { assertArrayEquals(new long[]{0}, PrefixSums.prefix(new int[0])); }
}
