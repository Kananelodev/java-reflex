package drills.p09_dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CoinChangeTest {

    @Test void basic() { assertEquals(3, CoinChange.coinChange(new int[]{1, 2, 5}, 11)); }
    @Test void impossible() { assertEquals(-1, CoinChange.coinChange(new int[]{2}, 3)); }
    @Test void zero() { assertEquals(0, CoinChange.coinChange(new int[]{1}, 0)); }
    @Test void greedyFails() { assertEquals(2, CoinChange.coinChange(new int[]{1, 3, 4}, 6)); }
    @Test void harder() { assertEquals(20, CoinChange.coinChange(new int[]{186, 419, 83, 408}, 6249)); }
    @Test void large() { assertEquals(400, CoinChange.coinChange(new int[]{1, 5, 10, 25}, 10_000)); }
}
