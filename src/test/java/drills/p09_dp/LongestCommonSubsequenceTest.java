package drills.p09_dp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LongestCommonSubsequenceTest {

    @Test void basic() { assertEquals(3, LongestCommonSubsequence.lcs("abcde", "ace")); }
    @Test void same() { assertEquals(3, LongestCommonSubsequence.lcs("abc", "abc")); }
    @Test void none() { assertEquals(0, LongestCommonSubsequence.lcs("abc", "def")); }
    @Test void empty() { assertEquals(0, LongestCommonSubsequence.lcs("", "abc")); }
    @Test void large() {
        String s = "ab".repeat(1500);
        assertEquals(3000, LongestCommonSubsequence.lcs(s, s));
        assertEquals(1500, LongestCommonSubsequence.lcs(s, "a".repeat(3000)));
    }
}
