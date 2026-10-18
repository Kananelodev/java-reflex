package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class LetterCountsTest {

    @Test void hello() {
        int[] c = LetterCounts.letterCounts("hello");
        assertEquals(1, c['h' - 'a']); assertEquals(1, c['e' - 'a']);
        assertEquals(2, c['l' - 'a']); assertEquals(1, c['o' - 'a']);
        assertEquals(5, IntStream.of(c).sum());
    }
    @Test void empty() { assertArrayEquals(new int[26], LetterCounts.letterCounts("")); }
    @Test void ignoresNonLowercase() {
        int[] c = LetterCounts.letterCounts("Hello, World! 123");
        assertEquals(0, c['h' - 'a']); assertEquals(3, c['l' - 'a']); assertEquals(2, c['o' - 'a']);
        assertEquals(8, IntStream.of(c).sum());
    }
}
