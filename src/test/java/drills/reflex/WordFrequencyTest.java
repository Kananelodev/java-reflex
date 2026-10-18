package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class WordFrequencyTest {

    @Test void mixedCaseAndSpaces() {
        assertEquals(Map.of("the", 3, "cat", 1, "dog", 1),
                     WordFrequency.wordFrequency("the cat The  dog\tTHE"));
    }
    @Test void emptyString() { assertEquals(Map.of(), WordFrequency.wordFrequency("")); }
    @Test void onlySpaces() { assertEquals(Map.of(), WordFrequency.wordFrequency("   \n  ")); }
    @Test void leadingSpaces() { assertEquals(Map.of("a", 2), WordFrequency.wordFrequency("  a a")); }
}
