package drills.p07_bfs_grid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ShortestPathBinaryMatrixTest {

    @Test void diagonal() { assertEquals(2, ShortestPathBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}})); }
    @Test void around() { assertEquals(4, ShortestPathBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}})); }
    @Test void blockedStart() { assertEquals(-1, ShortestPathBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}})); }
    @Test void oneCell() { assertEquals(1, ShortestPathBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0}})); }
    @Test void wall() { assertEquals(-1, ShortestPathBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{0, 1, 0}, {1, 1, 0}, {0, 0, 0}})); }
    @Test void large() {
        int[][] grid = new int[500][500];
        assertEquals(500, ShortestPathBinaryMatrix.shortestPathBinaryMatrix(grid));
    }
}
