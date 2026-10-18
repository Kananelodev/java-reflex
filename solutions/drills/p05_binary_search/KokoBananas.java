package drills.p05_binary_search;

import java.io.*;
import java.util.*;

/**
 * K20 - Koko Eating Bananas (search on the answer)  [Medium, target 12 min]
 *
 * piles[i] bananas in each pile. At speed k Koko eats up to k bananas from ONE pile per hour
 * (a pile of 7 at speed 3 takes 3 hours). Return the minimum integer k to finish all piles
 * within h hours (h >= piles.length). Piles go up to 1,000,000,000 - total hours can overflow
 * an int, and so can p + k - 1.
 *
 * Example: [3, 6, 7, 11], h = 8 -> 4
 */
public class KokoBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int lo = 1, hi = 1;
        for (int p : piles) hi = Math.max(hi, p);
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            long hours = 0;
            for (int p : piles) hours += ((long) p + mid - 1) / mid;
            if (hours <= h) hi = mid; else lo = mid + 1;
        }
        return lo;
    }
}
