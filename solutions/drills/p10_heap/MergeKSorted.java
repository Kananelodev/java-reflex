package drills.p10_heap;

import java.io.*;
import java.util.*;

/**
 * K40 - Merge K Sorted Arrays  [Medium, target 12 min]
 *
 * Each array is sorted ascending (some may be empty). Return one sorted array with every element.
 * Aim for O(N log k) with a min-heap holding one "next element" per array.
 *
 * Example: [[1,4,5],[1,3,4],[2,6]] -> [1,1,2,3,4,4,5,6]
 */
public class MergeKSorted {

    public static int[] mergeK(int[][] arrays) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((p, q) -> Integer.compare(p[0], q[0]));  // {value, array, index}
        int total = 0;
        for (int i = 0; i < arrays.length; i++) {
            total += arrays[i].length;
            if (arrays[i].length > 0) heap.offer(new int[]{arrays[i][0], i, 0});
        }
        int[] out = new int[total];
        int pos = 0;
        while (!heap.isEmpty()) {
            int[] cur = heap.poll();
            out[pos++] = cur[0];
            int next = cur[2] + 1;
            if (next < arrays[cur[1]].length) heap.offer(new int[]{arrays[cur[1]][next], cur[1], next});
        }
        return out;
    }
}
