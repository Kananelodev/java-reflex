package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SortPairsTest {

    @Test void basic() {
        int[][] p = {{1, 2}, {0, 5}, {1, 9}};
        assertArrayEquals(new int[][]{{0, 5}, {1, 9}, {1, 2}}, SortPairs.sortPairs(p));
    }
    @Test void extremeValues() {
        int[][] p = {{1, 2}, {Integer.MAX_VALUE, 1}, {Integer.MIN_VALUE, 0}, {0, Integer.MIN_VALUE}, {0, Integer.MAX_VALUE}};
        assertArrayEquals(new int[][]{{Integer.MIN_VALUE, 0}, {0, Integer.MAX_VALUE}, {0, Integer.MIN_VALUE},
                                      {1, 2}, {Integer.MAX_VALUE, 1}}, SortPairs.sortPairs(p));
    }
    @Test void sortsInPlace() {
        int[][] p = {{2, 0}, {1, 0}};
        SortPairs.sortPairs(p);
        assertEquals(1, p[0][0]);
    }
}
