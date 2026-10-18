package drills.p09_dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ClimbingStairsTest {

    @Test void small() {
        assertEquals(1, ClimbingStairs.climbStairs(1)); assertEquals(2, ClimbingStairs.climbStairs(2));
        assertEquals(3, ClimbingStairs.climbStairs(3)); assertEquals(8, ClimbingStairs.climbStairs(5));
    }
    @Test void n45() { assertEquals(1836311903L, ClimbingStairs.climbStairs(45)); }
    @Test void n90() { assertEquals(4660046610375530309L, ClimbingStairs.climbStairs(90)); }
}
