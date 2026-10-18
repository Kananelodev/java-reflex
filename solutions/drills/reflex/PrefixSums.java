package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R07 - Prefix sum array  [Reflex, target 2 min]
 *
 * prefix(a) returns a long[] of length n + 1 where pre[i] = a[0] + ... + a[i-1] (pre[0] = 0).
 * rangeSum(pre, l, r) returns a[l] + ... + a[r] (inclusive) in O(1).
 * Use long: sums can exceed the int range.
 */
public class PrefixSums {

    public static long[] prefix(int[] a) {
        long[] pre = new long[a.length + 1];
        for (int i = 0; i < a.length; i++) pre[i + 1] = pre[i] + a[i];
        return pre;
    }

    public static long rangeSum(long[] pre, int l, int r) {
        return pre[r + 1] - pre[l];
    }
}
