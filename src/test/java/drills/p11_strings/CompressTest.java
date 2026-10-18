package drills.p11_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CompressTest {

    @Test void basic() { assertEquals("a3bc2", Compress.compress("aaabcc")); }
    @Test void empty() { assertEquals("", Compress.compress("")); }
    @Test void noRuns() { assertEquals("abc", Compress.compress("abc")); }
    @Test void multiDigit() { assertEquals("a12", Compress.compress("aaaaaaaaaaaa")); }
    @Test void repeatsLater() { assertEquals("a2b2a2", Compress.compress("aabbaa")); }
    @Test void large() { assertEquals("x200000", Compress.compress("x".repeat(200_000))); }
}
