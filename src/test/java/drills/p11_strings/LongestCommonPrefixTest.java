package drills.p11_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LongestCommonPrefixTest {

    @Test void basic() { assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); }
    @Test void none() { assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"})); }
    @Test void single() { assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"a"})); }
    @Test void emptyArray() { assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[0])); }
    @Test void shorterLater() { assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"})); }
    @Test void emptyStrings() { assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"", ""})); }
}
