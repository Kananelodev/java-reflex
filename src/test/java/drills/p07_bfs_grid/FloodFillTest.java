package drills.p07_bfs_grid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FloodFillTest {

    @Test void basic() {
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
            FloodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    }
    @Test void sameColor() {
        assertArrayEquals(new int[][]{{0, 0, 0}, {0, 0, 0}}, FloodFill.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0));
    }
    @Test void singlePixel() { assertArrayEquals(new int[][]{{5}}, FloodFill.floodFill(new int[][]{{1}}, 0, 0, 5)); }
    @Test void huge() {
        int[][] img = new int[1000][1000];
        int[][] out = FloodFill.floodFill(img, 500, 500, 1);
        for (int[] row : out) for (int v : row) assertEquals(1, v);
    }
}
