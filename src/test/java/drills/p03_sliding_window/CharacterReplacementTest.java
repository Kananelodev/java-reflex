package drills.p03_sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CharacterReplacementTest {

    @Test void abab() { assertEquals(4, CharacterReplacement.characterReplacement("ABAB", 2)); }
    @Test void aababba() { assertEquals(4, CharacterReplacement.characterReplacement("AABABBA", 1)); }
    @Test void noChanges() { assertEquals(4, CharacterReplacement.characterReplacement("AAAA", 0)); }
    @Test void noChangesMixed() { assertEquals(2, CharacterReplacement.characterReplacement("ABBA", 0)); }
    @Test void empty() { assertEquals(0, CharacterReplacement.characterReplacement("", 3)); }
}
