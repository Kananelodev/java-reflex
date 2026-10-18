package drills.p10_heap;

import java.io.*;
import java.util.*;

/**
 * K38 - Top K Frequent Elements  [Medium, target 10 min]
 *
 * Return the k most frequent values (any order). The answer is guaranteed to be unique.
 *
 * Example: [1, 1, 1, 2, 2, 3], k = 2 -> [1, 2]
 */
public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums) freq.merge(x, 1, Integer::sum);
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((p, q) -> Integer.compare(p.getValue(), q.getValue()));
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            heap.offer(e);
            if (heap.size() > k) heap.poll();
        }
        int[] out = new int[k];
        for (int i = 0; i < k; i++) out[i] = heap.poll().getKey();
        return out;
    }
}
