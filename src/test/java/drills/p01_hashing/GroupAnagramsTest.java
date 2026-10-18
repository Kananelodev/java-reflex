package drills.p01_hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GroupAnagramsTest {

    @Test void basic() {
        assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat")),
                     GroupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
    @Test void emptyWord() { assertEquals(List.of(List.of("")), GroupAnagrams.groupAnagrams(new String[]{""})); }
    @Test void single() { assertEquals(List.of(List.of("a")), GroupAnagrams.groupAnagrams(new String[]{"a"})); }
    @Test void noInput() { assertEquals(List.of(), GroupAnagrams.groupAnagrams(new String[0])); }
}
