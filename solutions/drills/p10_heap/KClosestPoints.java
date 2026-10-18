package drills.p10_heap;

import java.io.*;
import java.util.*;

/**
 * K39 - K Closest Points to Origin  [Medium, target 10 min]
 *
 * Return the k points closest to (0, 0) by Euclidean distance (any order). The answer is unique.
 * Coordinates can be large: x*x + y*y overflows an int - compare squared distances as long.
 *
 * Example: [[3,3],[5,-1],[-2,4]], k = 2 -> [[3,3],[-2,4]]
 */
public class KClosestPoints {

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((p, q) -> Long.compare(dist(q), dist(p)));  // max-heap
        for (int[] p : points) {
            heap.offer(p);
            if (heap.size() > k) heap.poll();
        }
        return heap.toArray(new int[0][]);
    }

    private static long dist(int[] p) {
        return (long) p[0] * p[0] + (long) p[1] * p[1];
    }
}
