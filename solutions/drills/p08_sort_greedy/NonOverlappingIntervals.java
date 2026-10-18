package drills.p08_sort_greedy;

import java.io.*;
import java.util.*;

/**
 * K31 - Non-overlapping Intervals  [Medium, target 12 min]
 *
 * Return the minimum number of intervals to remove so the rest do not overlap.
 * Touching intervals ([1,2] and [2,3]) do NOT overlap.
 *
 * Example: [[1,2],[2,3],[3,4],[1,3]] -> 1
 * Hint: sort by END time and greedily keep the interval that finishes first.
 */
public class NonOverlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[1], y[1]));
        int kept = 0;
        long end = Long.MIN_VALUE;
        for (int[] iv : intervals) {
            if (iv[0] >= end) { kept++; end = iv[1]; }
        }
        return intervals.length - kept;
    }
}
