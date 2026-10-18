package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ReverseWordsTest {

    @Test void basic() { assertEquals("blue is sky the", ReverseWords.reverseWords("the sky is blue")); }
    @Test void extraSpaces() { assertEquals("blue is sky the", ReverseWords.reverseWords("  the sky  is blue ")); }
    @Test void single() { assertEquals("a", ReverseWords.reverseWords("a")); }
    @Test void blank() { assertEquals("", ReverseWords.reverseWords("   ")); }
    @Test void empty() { assertEquals("", ReverseWords.reverseWords("")); }
}
