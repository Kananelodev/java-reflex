package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class GroupByLengthTest {

    @Test void basic() {
        assertEquals(Map.of(2, List.of("hi", "yo"), 3, List.of("cat", "dog")),
                     GroupByLength.groupByLength(List.of("hi", "cat", "yo", "dog")));
    }
    @Test void empty() { assertEquals(Map.of(), GroupByLength.groupByLength(List.of())); }
    @Test void emptyWord() {
        assertEquals(Map.of(0, List.of("", ""), 1, List.of("a")),
                     GroupByLength.groupByLength(List.of("", "a", "")));
    }
}
