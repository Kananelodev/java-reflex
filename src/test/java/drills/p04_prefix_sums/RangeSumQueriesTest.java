package drills.p04_prefix_sums;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RangeSumQueriesTest {

    @Test void basic() {
        assertArrayEquals(new long[]{6, 3, 14, 1},
            RangeSumQueries.answerQueries(new int[]{3, 1, 4, 1, 5}, new int[][]{{1, 3}, {0, 0}, {0, 4}, {3, 3}}));
    }
    @Test void negatives() {
        assertArrayEquals(new long[]{0, -2}, RangeSumQueries.answerQueries(new int[]{2, -2, -1, 1}, new int[][]{{0, 1}, {1, 3}}));
    }
    @Test void large() {
        int n = 200_000;
        int[] a = new int[n];
        Arrays.fill(a, 1_000_000_000);
        int[][] qs = new int[n][];
        for (int i = 0; i < n; i++) qs[i] = new int[]{0, n - 1};
        long[] out = RangeSumQueries.answerQueries(a, qs);
        for (long v : out) assertEquals(200_000L * 1_000_000_000L, v);
    }
}
