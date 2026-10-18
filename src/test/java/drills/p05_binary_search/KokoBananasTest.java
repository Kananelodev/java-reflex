package drills.p05_binary_search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class KokoBananasTest {

    @Test void basic() { assertEquals(4, KokoBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 8)); }
    @Test void tight() { assertEquals(30, KokoBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5)); }
    @Test void oneSpare() { assertEquals(23, KokoBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6)); }
    @Test void bigPile() { assertEquals(500_000_000, KokoBananas.minEatingSpeed(new int[]{1_000_000_000}, 2)); }
    @Test void hourOverflow() { assertEquals(3, KokoBananas.minEatingSpeed(new int[]{805306368, 805306368, 805306368}, 1_000_000_000)); }
}
