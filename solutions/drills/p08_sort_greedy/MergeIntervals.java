package drills.p08_sort_greedy;

import java.io.*;
import java.util.*;

/**
 * K29 - Merge Intervals  [Medium, target 10 min]
 *
 * Merge all overlapping intervals and return them sorted by start. Intervals that only touch
 * ([1,4] and [4,5]) also merge. The input is NOT sorted.
 *
 * Example: [[1,3],[2,6],[8,10],[15,18]] -> [[1,6],[8,10],[15,18]]
 */
public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));
        List<int[]> res = new ArrayList<>();
        for (int[] cur : intervals) {
            if (res.isEmpty() || res.get(res.size() - 1)[1] < cur[0]) res.add(new int[]{cur[0], cur[1]});
            else {
                int[] last = res.get(res.size() - 1);
                last[1] = Math.max(last[1], cur[1]);
            }
        }
        return res.toArray(new int[0][]);
    }
}
