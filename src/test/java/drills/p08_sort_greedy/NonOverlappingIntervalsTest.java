package drills.p08_sort_greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NonOverlappingIntervalsTest {

    @Test void basic() { assertEquals(1, NonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}})); }
    @Test void duplicates() { assertEquals(2, NonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}})); }
    @Test void touching() { assertEquals(0, NonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}})); }
    @Test void longOne() { assertEquals(2,NonOverlappingIntervals.eraseOverlapIntervals(new int[][]{{1, 100}, {11, 22}, {1, 11}, {2, 12}})); }
    @Test void empty() { assertEquals(0, NonOverlappingIntervals.eraseOverlapIntervals(new int[0][])); }
}
