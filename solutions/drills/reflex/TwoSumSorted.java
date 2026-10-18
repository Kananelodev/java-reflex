package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R12 - Two pointers on a sorted array  [Reflex, target 3 min]
 *
 * a is sorted ascending and has exactly one pair of different indices i < j with
 * a[i] + a[j] == target. Return {i, j}. Use two pointers (O(n), O(1) extra space).
 *
 * Example: [1, 2, 4, 7, 11], target 9 -> {1, 3}
 */
public class TwoSumSorted {

    public static int[] twoSumSorted(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            long sum = (long) a[i] + a[j];
            if (sum == target) return new int[]{i, j};
            if (sum < target) i++; else j--;
        }
        return new int[]{-1, -1};
    }
}
