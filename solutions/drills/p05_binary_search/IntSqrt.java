package drills.p05_binary_search;

import java.io.*;
import java.util.*;

/**
 * K19 - Integer Square Root  [Easy, target 7 min]
 *
 * Return floor(sqrt(x)) for x >= 0 WITHOUT Math.sqrt or Math.pow.
 * Binary search on the answer - and watch out: mid * mid overflows an int.
 *
 * Example: 8 -> 2, 2147395599 -> 46339
 */
public class IntSqrt {

    public static int mySqrt(int x) {
        long lo = 0, hi = x;
        while (lo < hi) {
            long mid = (lo + hi + 1) / 2;
            if (mid * mid <= x) lo = mid; else hi = mid - 1;
        }
        return (int) lo;
    }
}
