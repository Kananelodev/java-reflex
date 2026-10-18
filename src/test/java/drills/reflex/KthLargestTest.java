package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class KthLargestTest {

    @Test void basic() { assertEquals(5, KthLargest.kthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2)); }
    @Test void duplicates() { assertEquals(4, KthLargest.kthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)); }
    @Test void negatives() { assertEquals(-3, KthLargest.kthLargest(new int[]{-1, -3, -2}, 3)); }
    @Test void single() { assertEquals(7, KthLargest.kthLargest(new int[]{7}, 1)); }
}
