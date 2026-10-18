package drills.p10_heap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LastStoneWeightTest {

    @Test void basic() { assertEquals(1, LastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1})); }
    @Test void single() { assertEquals(1, LastStoneWeight.lastStoneWeight(new int[]{1})); }
    @Test void cancel() { assertEquals(0, LastStoneWeight.lastStoneWeight(new int[]{2, 2})); }
    @Test void three() { assertEquals(1, LastStoneWeight.lastStoneWeight(new int[]{3, 7, 3})); }
}
