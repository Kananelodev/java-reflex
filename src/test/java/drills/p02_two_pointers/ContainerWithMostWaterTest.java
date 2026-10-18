package drills.p02_two_pointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ContainerWithMostWaterTest {

    @Test void basic() { assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})); }
    @Test void two() { assertEquals(1, ContainerWithMostWater.maxArea(new int[]{1, 1})); }
    @Test void tallMiddle() { assertEquals(16, ContainerWithMostWater.maxArea(new int[]{4, 3, 2, 1, 4})); }
    @Test void large() {
        int[] h = new int[100_000];
        Arrays.fill(h, 1);
        assertEquals(99_999, ContainerWithMostWater.maxArea(h));
    }
}
