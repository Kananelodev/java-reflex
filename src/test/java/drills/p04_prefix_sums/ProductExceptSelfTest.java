package drills.p04_prefix_sums;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ProductExceptSelfTest {

    @Test void basic() { assertArrayEquals(new int[]{24, 12, 8, 6}, ProductExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4})); }
    @Test void withZero() { assertArrayEquals(new int[]{0, 0, 9, 0, 0}, ProductExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3})); }
    @Test void twoZeros() { assertArrayEquals(new int[]{0, 0, 0}, ProductExceptSelf.productExceptSelf(new int[]{0, 4, 0})); }
    @Test void two() { assertArrayEquals(new int[]{3, 2}, ProductExceptSelf.productExceptSelf(new int[]{2, 3})); }
    @Test void large() {
        int[] a = new int[100_000];
        Arrays.fill(a, 1);
        int[] out = ProductExceptSelf.productExceptSelf(a);
        assertEquals(100_000, out.length);
        for (int v : out) assertEquals(1, v);
    }
}
