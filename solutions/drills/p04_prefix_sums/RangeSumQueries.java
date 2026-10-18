package drills.p04_prefix_sums;

import java.io.*;
import java.util.*;

/**
 * K13 - Range Sum Queries  [Easy, target 6 min]
 *
 * Each query is {l, r}. Return a long[] with the sum of a[l..r] (inclusive) for every query.
 * Must be O(n + q): one test has 200,000 numbers and 200,000 queries.
 */
public class RangeSumQueries {

    public static long[] answerQueries(int[] a, int[][] queries) {
        long[] pre = new long[a.length + 1];
        for (int i = 0; i < a.length; i++) pre[i + 1] = pre[i] + a[i];
        long[] out = new long[queries.length];
        for (int i = 0; i < queries.length; i++) out[i] = pre[queries[i][1] + 1] - pre[queries[i][0]];
        return out;
    }
}
