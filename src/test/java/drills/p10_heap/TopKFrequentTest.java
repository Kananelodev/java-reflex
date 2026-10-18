package drills.p10_heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TopKFrequentTest {

    static int[] sorted(int[] a) { int[] b = a.clone(); Arrays.sort(b); return b; }
    @Test void basic() { assertArrayEquals(new int[]{1, 2}, sorted(TopKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2))); }
    @Test void single() { assertArrayEquals(new int[]{1}, sorted(TopKFrequent.topKFrequent(new int[]{1}, 1))); }
    @Test void negatives() { assertArrayEquals(new int[]{-1, 2}, sorted(TopKFrequent.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2))); }
    @Test void allOfThem() { assertArrayEquals(new int[]{5, 6}, sorted(TopKFrequent.topKFrequent(new int[]{5, 6}, 2))); }
}
