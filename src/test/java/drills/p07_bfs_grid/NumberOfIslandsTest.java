package drills.p07_bfs_grid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NumberOfIslandsTest {

    static char[][] g(String... rows) { return Arrays.stream(rows).map(String::toCharArray).toArray(char[][]::new); }

    @Test void one() { assertEquals(1, NumberOfIslands.numIslands(g("11110", "11010", "11000", "00000"))); }
    @Test void three() { assertEquals(3, NumberOfIslands.numIslands(g("11000", "11000", "00100", "00011"))); }
    @Test void diagonalIsSeparate() { assertEquals(2, NumberOfIslands.numIslands(g("10", "01"))); }
    @Test void water() { assertEquals(0, NumberOfIslands.numIslands(g("000"))); }
    @Test void hugeIsland() {
        char[][] grid = new char[1000][1000];
        for (char[] row : grid) Arrays.fill(row, '1');
        assertEquals(1, NumberOfIslands.numIslands(grid));
    }
}
