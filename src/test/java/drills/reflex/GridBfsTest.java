package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GridBfsTest {

    static char[][] g(String... rows) { return Arrays.stream(rows).map(String::toCharArray).toArray(char[][]::new); }

    @Test void basic() {
        assertArrayEquals(new int[][]{{0, 1, -1}, {1, -1, 5}, {2, 3, 4}},
                          GridBfs.bfs(g("..#", ".#.", "..."), 0, 0));
    }
    @Test void boxedIn() {
        assertArrayEquals(new int[][]{{0, -1, -1}, {-1, -1, -1}, {-1, -1, -1}},
                          GridBfs.bfs(g(".#.", "#..", "..."), 0, 0));
    }
    @Test void oneCell() { assertArrayEquals(new int[][]{{0}}, GridBfs.bfs(g("."), 0, 0)); }
    @Test void startInMiddle() {
        assertArrayEquals(new int[][]{{2, 1, 2}, {1, 0, 1}, {2, 1, 2}}, GridBfs.bfs(g("...", "...", "..."), 1, 1));
    }
}
