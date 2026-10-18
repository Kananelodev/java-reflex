package drills.reflex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class SortPeopleTest {

    @Test void sortsByAgeThenName() {
        var in = List.of(new SortPeople.Person("Zola", 21), new SortPeople.Person("Ama", 25),
                         new SortPeople.Person("Bongi", 21), new SortPeople.Person("Ama", 19));
        var out = SortPeople.sortByAgeThenName(in);
        assertEquals(List.of(new SortPeople.Person("Ama", 19), new SortPeople.Person("Bongi", 21),
                             new SortPeople.Person("Zola", 21), new SortPeople.Person("Ama", 25)), out);
    }
    @Test void doesNotModifyInput() {
        var in = new ArrayList<>(List.of(new SortPeople.Person("B", 2), new SortPeople.Person("A", 1)));
        SortPeople.sortByAgeThenName(in);
        assertEquals("B", in.get(0).name());
    }
    @Test void empty() { assertEquals(List.of(), SortPeople.sortByAgeThenName(List.of())); }
}
