package drills.p08_sort_greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MergeIntervalsTest {

    @Test void basic() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, MergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }
    @Test void touching() { assertArrayEquals(new int[][]{{1, 5}}, MergeIntervals.merge(new int[][]{{1, 4}, {4, 5}})); }
    @Test void unsorted() { assertArrayEquals(new int[][]{{0, 4}}, MergeIntervals.merge(new int[][]{{1, 4}, {0, 4}})); }
    @Test void contained() { assertArrayEquals(new int[][]{{1, 4}}, MergeIntervals.merge(new int[][]{{1, 4}, {2, 3}})); }
    @Test void separate() { assertArrayEquals(new int[][]{{1, 2}, {3, 4}}, MergeIntervals.merge(new int[][]{{3, 4}, {1, 2}})); }
    @Test void empty() { assertArrayEquals(new int[0][], MergeIntervals.merge(new int[0][])); }
}
