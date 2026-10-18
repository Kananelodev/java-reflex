package drills.p05_binary_search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IntSqrtTest {

    @Test void small() {
        assertEquals(0, IntSqrt.mySqrt(0)); assertEquals(1, IntSqrt.mySqrt(1)); assertEquals(1, IntSqrt.mySqrt(3));
        assertEquals(2, IntSqrt.mySqrt(4)); assertEquals(2, IntSqrt.mySqrt(8)); assertEquals(3, IntSqrt.mySqrt(9));
    }
    @Test void large() { assertEquals(46339, IntSqrt.mySqrt(2147395599)); }
    @Test void maxInt() { assertEquals(46340, IntSqrt.mySqrt(Integer.MAX_VALUE)); }
}
