package drills.p04_prefix_sums;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PivotIndexTest {

    @Test void middle() { assertEquals(3, PivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6})); }
    @Test void none() { assertEquals(-1, PivotIndex.pivotIndex(new int[]{1, 2, 3})); }
    @Test void first() { assertEquals(0, PivotIndex.pivotIndex(new int[]{2, 1, -1})); }
    @Test void last() { assertEquals(2, PivotIndex.pivotIndex(new int[]{-1, 1, 5})); }
    @Test void single() { assertEquals(0, PivotIndex.pivotIndex(new int[]{9})); }
}
