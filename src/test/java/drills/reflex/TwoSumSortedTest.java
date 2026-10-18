package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TwoSumSortedTest {

    @Test void basic() { assertArrayEquals(new int[]{1, 3}, TwoSumSorted.twoSumSorted(new int[]{1, 2, 4, 7, 11}, 9)); }
    @Test void negatives() { assertArrayEquals(new int[]{0, 2}, TwoSumSorted.twoSumSorted(new int[]{-5, -2, 1, 8}, -4)); }
    @Test void endsOfArray() { assertArrayEquals(new int[]{0, 3}, TwoSumSorted.twoSumSorted(new int[]{1, 5, 7, 10}, 11)); }
    @Test void twoElements() { assertArrayEquals(new int[]{0, 1}, TwoSumSorted.twoSumSorted(new int[]{3, 3}, 6)); }
}
