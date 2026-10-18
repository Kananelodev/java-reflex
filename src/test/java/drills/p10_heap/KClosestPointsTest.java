package drills.p10_heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class KClosestPointsTest {

    static int[][] sorted(int[][] a) {
        int[][] b = a.clone();
        Arrays.sort(b, (p, q) -> p[0] != q[0] ? Integer.compare(p[0], q[0]) : Integer.compare(p[1], q[1]));
        return b;
    }
    @Test void one() { assertArrayEquals(new int[][]{{-2, 2}}, sorted(KClosestPoints.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1))); }
    @Test void two() { assertArrayEquals(new int[][]{{-2, 4}, {3, 3}}, sorted(KClosestPoints.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2))); }
    @Test void overflow() { assertArrayEquals(new int[][]{{0, 1}}, sorted(KClosestPoints.kClosest(new int[][]{{46341, 0}, {0, 1}}, 1))); }
    @Test void all() { assertArrayEquals(new int[][]{{0, 0}, {1, 1}}, sorted(KClosestPoints.kClosest(new int[][]{{1, 1}, {0, 0}}, 2))); }
}
