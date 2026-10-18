package drills.p06_stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class DailyTemperaturesTest {

    @Test void basic() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, DailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
    @Test void increasing() { assertArrayEquals(new int[]{1, 1, 1, 0}, DailyTemperatures.dailyTemperatures(new int[]{30, 40, 50, 60})); }
    @Test void equalIsNotWarmer() { assertArrayEquals(new int[]{2, 1, 0}, DailyTemperatures.dailyTemperatures(new int[]{30, 30, 31})); }
    @Test void largeDecreasing() {
        int[] t = IntStream.range(0, 100_000).map(i -> 100_000 - i).toArray();
        assertArrayEquals(new int[100_000], DailyTemperatures.dailyTemperatures(t));
    }
}
