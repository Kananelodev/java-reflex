package drills.p10_heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MergeKSortedTest {

    @Test void basic() { assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, MergeKSorted.mergeK(new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}})); }
    @Test void none() { assertArrayEquals(new int[0], MergeKSorted.mergeK(new int[0][])); }
    @Test void emptyArrays() { assertArrayEquals(new int[0], MergeKSorted.mergeK(new int[][]{{}, {}})); }
    @Test void singles() { assertArrayEquals(new int[]{0, 1}, MergeKSorted.mergeK(new int[][]{{1}, {0}})); }
    @Test void negatives() { assertArrayEquals(new int[]{-5, -3, -1, 0, 2}, MergeKSorted.mergeK(new int[][]{{-3, 0}, {}, {-5, -1, 2}})); }
}
