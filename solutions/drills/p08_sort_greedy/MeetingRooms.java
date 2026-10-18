package drills.p08_sort_greedy;

import java.io.*;
import java.util.*;

/**
 * K30 - Meeting Rooms II  [Medium, target 12 min]
 *
 * Each interval is {start, end}. Return the minimum number of rooms needed so no two meetings
 * share a room at the same time. A meeting ending at 5 frees the room for one starting at 5.
 *
 * Example: [[0,30],[5,10],[15,20]] -> 2
 * Hint: sort by start; a min-heap holds end times of rooms in use.
 */
public class MeetingRooms {

    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));
        PriorityQueue<Integer> ends = new PriorityQueue<>();
        for (int[] iv : intervals) {
            if (!ends.isEmpty() && ends.peek() <= iv[0]) ends.poll();
            ends.offer(iv[1]);
        }
        return ends.size();
    }
}
