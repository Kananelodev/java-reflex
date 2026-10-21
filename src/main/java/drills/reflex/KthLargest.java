package drills.reflex;

import java.util.PriorityQueue;

/**
 * R09 - PriorityQueue min-heap of size k  [Reflex, target 3 min]
 *
 * Return the k-th largest element of a (1-based: k = 1 is the maximum). Duplicates count
 * separately. Use a min-heap that never holds more than k elements.
 *
 * Example: [3, 2, 1, 5, 6, 4], k = 2 -> 5
 */
public class KthLargest {

    public static int kthLargest(int[] a, int k) {
        // TODO

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i : a) {
            minHeap.add(i);

            if (minHeap.size() > k) {
            minHeap.poll();
            }
        }

        


        // Integer[] b = new Integer[a.length];

        // for(int i = 0; i < a.length; i++) {
        //     b[i] = a[i];
        // }
        // Arrays.sort(b, Collections.reverseOrder());

        // Integer[] minHeap = Arrays.copyOf(b, k);

        // int min = minHeap[0];

        // for (int i = 1; i < minHeap.length; i++ ) {
        //     if(minHeap[i] < min) {
        //         min = minHeap[i];
        //     }
        // }

        return minHeap.peek();
    }
}
