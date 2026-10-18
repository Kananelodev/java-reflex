package drills.p09_dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UniquePathsObstaclesTest {

    @Test void basic() { assertEquals(2, UniquePathsObstacles.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}})); }
    @Test void small() { assertEquals(1, UniquePathsObstacles.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}})); }
    @Test void blockedStart() { assertEquals(0, UniquePathsObstacles.uniquePathsWithObstacles(new int[][]{{1}})); }
    @Test void oneCell() { assertEquals(1, UniquePathsObstacles.uniquePathsWithObstacles(new int[][]{{0}})); }
    @Test void blockedEnd() { assertEquals(0, UniquePathsObstacles.uniquePathsWithObstacles(new int[][]{{0, 0}, {0, 1}})); }
    @Test void large() { assertEquals(601080390, UniquePathsObstacles.uniquePathsWithObstacles(new int[17][17])); }
}
