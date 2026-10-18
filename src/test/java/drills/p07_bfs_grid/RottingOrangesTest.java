package drills.p07_bfs_grid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class RottingOrangesTest {

    @Test void basic() { assertEquals(4, RottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}})); }
    @Test void unreachable() { assertEquals(-1, RottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}})); }
    @Test void noFresh() { assertEquals(0, RottingOranges.orangesRotting(new int[][]{{0, 2}})); }
    @Test void empty() { assertEquals(0, RottingOranges.orangesRotting(new int[][]{{0}})); }
    @Test void freshNoRotten() { assertEquals(-1, RottingOranges.orangesRotting(new int[][]{{1}})); }
    @Test void twoSources() { assertEquals(2, RottingOranges.orangesRotting(new int[][]{{2, 1, 1, 1, 2}})); }
}
