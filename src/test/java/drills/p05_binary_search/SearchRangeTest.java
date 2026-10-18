package drills.p05_binary_search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SearchRangeTest {

    @Test void found() { assertArrayEquals(new int[]{3, 4}, SearchRange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)); }
    @Test void missing() { assertArrayEquals(new int[]{-1, -1}, SearchRange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)); }
    @Test void empty() { assertArrayEquals(new int[]{-1, -1}, SearchRange.searchRange(new int[0], 0)); }
    @Test void single() { assertArrayEquals(new int[]{0, 0}, SearchRange.searchRange(new int[]{1}, 1)); }
    @Test void maxValue() {
        assertArrayEquals(new int[]{1, 2}, SearchRange.searchRange(new int[]{1, Integer.MAX_VALUE, Integer.MAX_VALUE}, Integer.MAX_VALUE));
    }
    @Test void fastEnough() {
        int[] a = IntStream.range(0, 2_000_000).map(i -> i / 2).toArray();
        for (int q = 0; q < 200_000; q++) assertArrayEquals(new int[]{2 * q, 2 * q + 1}, SearchRange.searchRange(a, q));
    }
}
