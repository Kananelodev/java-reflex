package drills.p02_two_pointers;

import java.io.*;
import java.util.*;

/**
 * K08 - Container With Most Water  [Medium, target 10 min]
 *
 * h[i] is the height of a vertical line at x = i. Pick two lines; the water they hold is
 * min(h[i], h[j]) * (j - i). Return the maximum. Must be O(n): one test has 100,000 lines.
 *
 * Example: [1,8,6,2,5,4,8,3,7] -> 49
 */
public class ContainerWithMostWater {

    public static int maxArea(int[] h) {
        int i = 0, j = h.length - 1, best = 0;
        while (i < j) {
            best = Math.max(best, Math.min(h[i], h[j]) * (j - i));
            if (h[i] < h[j]) i++; else j--;
        }
        return best;
    }
}
