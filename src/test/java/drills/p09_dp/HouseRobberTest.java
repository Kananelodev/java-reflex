package drills.p09_dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class HouseRobberTest {

    @Test void basic() { assertEquals(4, HouseRobber.rob(new int[]{1, 2, 3, 1})); }
    @Test void five() { assertEquals(12, HouseRobber.rob(new int[]{2, 7, 9, 3, 1})); }
    @Test void notAlternating() { assertEquals(4, HouseRobber.rob(new int[]{2, 1, 1, 2})); }
    @Test void empty() { assertEquals(0, HouseRobber.rob(new int[0])); }
    @Test void single() { assertEquals(5, HouseRobber.rob(new int[]{5})); }
    @Test void large() {
        int[] a = new int[100_000];
        Arrays.fill(a, 1);
        assertEquals(50_000, HouseRobber.rob(a));
    }
}
