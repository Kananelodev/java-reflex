package drills.p01_hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FirstUniqueCharTest {

    @Test void first() { assertEquals(0, FirstUniqueChar.firstUniqChar("leetcode")); }
    @Test void middle() { assertEquals(2, FirstUniqueChar.firstUniqChar("loveleetcode")); }
    @Test void none() { assertEquals(-1, FirstUniqueChar.firstUniqChar("aabb")); }
    @Test void empty() { assertEquals(-1, FirstUniqueChar.firstUniqChar("")); }
    @Test void last() { assertEquals(4, FirstUniqueChar.firstUniqChar("aabbc")); }
}
