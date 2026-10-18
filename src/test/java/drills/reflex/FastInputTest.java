package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FastInputTest {

    @Test void basic() throws Exception { assertEquals(6, FastInput.sumFromInput("3\n1 2 3\n")); }
    @Test void bigNumbers() throws Exception { assertEquals(4_000_000_000L, FastInput.sumFromInput("2\n2000000000 2000000000\n")); }
    @Test void messySpacing() throws Exception { assertEquals(10, FastInput.sumFromInput(" 4 \n 1   2 3    4 \n")); }
    @Test void zero() throws Exception { assertEquals(0, FastInput.sumFromInput("0\n\n")); }
    @Test void negatives() throws Exception { assertEquals(-5, FastInput.sumFromInput("3\n-1 -2 -2\n")); }
}
