package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LowerBoundTest {

    @Test void basic() {
        int[] a = {1, 3, 3, 5};
        assertEquals(1, LowerBound.lowerBound(a, 3));
        assertEquals(3, LowerBound.lowerBound(a, 4));
        assertEquals(4, LowerBound.lowerBound(a, 6));
        assertEquals(0, LowerBound.lowerBound(a, 0));
        assertEquals(0, LowerBound.lowerBound(a, 1));
    }
    @Test void empty() { assertEquals(0, LowerBound.lowerBound(new int[0], 7)); }
    @Test void fastEnough() {
        int[] a = IntStream.range(0, 1_000_000).map(i -> i * 2).toArray();
        for (int q = 0; q < 200_000; q++) assertEquals((q + 1) / 2, LowerBound.lowerBound(a, q));
    }
}
