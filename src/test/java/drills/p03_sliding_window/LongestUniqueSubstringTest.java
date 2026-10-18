package drills.p03_sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LongestUniqueSubstringTest {

    @Test void abc() { assertEquals(3, LongestUniqueSubstring.lengthOfLongestSubstring("abcabcbb")); }
    @Test void same() { assertEquals(1, LongestUniqueSubstring.lengthOfLongestSubstring("bbbbb")); }
    @Test void pwwkew() { assertEquals(3, LongestUniqueSubstring.lengthOfLongestSubstring("pwwkew")); }
    @Test void empty() { assertEquals(0, LongestUniqueSubstring.lengthOfLongestSubstring("")); }
    @Test void space() { assertEquals(1, LongestUniqueSubstring.lengthOfLongestSubstring(" ")); }
    @Test void abba() { assertEquals(2, LongestUniqueSubstring.lengthOfLongestSubstring("abba")); }
    @Test void dvdf() { assertEquals(3, LongestUniqueSubstring.lengthOfLongestSubstring("dvdf")); }
}
