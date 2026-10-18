package drills.p08_sort_greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LargestNumberTest {

    @Test void two() { assertEquals("210", LargestNumber.largestNumber(new int[]{10, 2})); }
    @Test void classic() { assertEquals("9534330", LargestNumber.largestNumber(new int[]{3, 30, 34, 5, 9})); }
    @Test void zeros() { assertEquals("0", LargestNumber.largestNumber(new int[]{0, 0})); }
    @Test void single() { assertEquals("1", LargestNumber.largestNumber(new int[]{1})); }
    @Test void big() { assertEquals("999999999999999998999999997", LargestNumber.largestNumber(new int[]{999999998, 999999997, 999999999})); }
}
