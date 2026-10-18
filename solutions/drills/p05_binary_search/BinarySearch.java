package drills.p05_binary_search;

import java.io.*;
import java.util.*;

/**
 * K17 - Binary Search  [Easy, target 4 min]
 *
 * a is sorted ascending with distinct values. Return the index of x, or -1. Must be O(log n).
 *
 * Example: [-1, 0, 3, 5, 9, 12], x = 9 -> 4
 */
public class BinarySearch {

    public static int search(int[] a, int x) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == x) return mid;
            if (a[mid] < x) lo = mid + 1; else hi = mid - 1;
        }
        return -1;
    }
}
