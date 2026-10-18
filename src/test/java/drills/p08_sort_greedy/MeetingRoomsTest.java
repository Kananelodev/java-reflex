package drills.p08_sort_greedy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MeetingRoomsTest {

    @Test void basic() { assertEquals(2, MeetingRooms.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}})); }
    @Test void noOverlap() { assertEquals(1, MeetingRooms.minMeetingRooms(new int[][]{{7, 10}, {2, 4}})); }
    @Test void backToBack() { assertEquals(1, MeetingRooms.minMeetingRooms(new int[][]{{1, 5}, {5, 10}})); }
    @Test void nested() { assertEquals(3, MeetingRooms.minMeetingRooms(new int[][]{{1, 10}, {2, 9}, {3, 8}})); }
    @Test void none() { assertEquals(0, MeetingRooms.minMeetingRooms(new int[0][])); }
}
