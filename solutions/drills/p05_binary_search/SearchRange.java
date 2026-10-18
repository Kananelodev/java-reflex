package drills.p05_binary_search;

import java.io.*;
import java.util.*;

/**
 * K18 - First and Last Position  [Medium, target 10 min]
 *
 * a is sorted ascending (duplicates allowed). Return {first, last} index of x, or {-1, -1}.
 * Must be O(log n) per call.
 *
 * Example: [5, 7, 7, 8, 8, 10], x = 8 -> {3, 4}
 * Hint: two lower-bound searches: lowerBound(x) and lowerBound(x + 1) - 1.
 */
public class SearchRange {

    public static int[] searchRange(int[] a, int x) {
        int first = lowerBound(a, x);
        if (first == a.length || a[first] != x) return new int[]{-1, -1};
        return new int[]{first, lowerBound(a, (long) x + 1) - 1};
    }

    private static int lowerBound(int[] a, long x) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] < x) lo = mid + 1; else hi = mid;
        }
        return lo;
    }
}
