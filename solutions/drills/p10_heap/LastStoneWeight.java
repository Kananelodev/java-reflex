package drills.p10_heap;

import java.io.*;
import java.util.*;

/**
 * K41 - Last Stone Weight  [Easy, target 6 min]
 *
 * Repeatedly smash the two heaviest stones x <= y: if x == y both are destroyed, otherwise a stone
 * of weight y - x remains. Return the weight of the last stone, or 0 if none are left.
 *
 * Example: [2, 7, 4, 1, 8, 1] -> 1
 */
public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) heap.offer(s);
        while (heap.size() > 1) {
            int y = heap.poll(), x = heap.poll();
            if (y != x) heap.offer(y - x);
        }
        return heap.isEmpty() ? 0 : heap.peek();
    }
}
