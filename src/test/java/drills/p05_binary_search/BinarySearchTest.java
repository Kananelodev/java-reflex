package drills.p05_binary_search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class BinarySearchTest {

    @Test void found() { assertEquals(4, BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 9)); }
    @Test void missing() { assertEquals(-1, BinarySearch.search(new int[]{-1, 0, 3, 5, 9, 12}, 2)); }
    @Test void single() { assertEquals(0, BinarySearch.search(new int[]{5}, 5)); }
    @Test void empty() { assertEquals(-1, BinarySearch.search(new int[0], 5)); }
    @Test void ends() {
        int[] a = {1, 3, 5, 7};
        assertEquals(0, BinarySearch.search(a, 1)); assertEquals(3, BinarySearch.search(a, 7));
        assertEquals(-1, BinarySearch.search(a, 8)); assertEquals(-1, BinarySearch.search(a, 0));
    }
    @Test void fastEnough() {
        int[] a = IntStream.range(0, 1_000_000).map(i -> i * 2).toArray();
        for (int q = 0; q < 1_000_000; q += 3) assertEquals(q % 2 == 0 ? q / 2 : -1, BinarySearch.search(a, q));
    }
}
