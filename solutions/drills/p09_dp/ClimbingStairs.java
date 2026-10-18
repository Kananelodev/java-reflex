package drills.p09_dp;

import java.io.*;
import java.util.*;

/**
 * K33 - Climbing Stairs  [Easy, target 5 min]
 *
 * You can climb 1 or 2 steps at a time. Return the number of distinct ways to reach step n (n >= 1)
 * as a long. n goes up to 90, so plain recursion is far too slow.
 *
 * Example: n = 3 -> 3 (1+1+1, 1+2, 2+1)
 */
public class ClimbingStairs {

    public static long climbStairs(int n) {
        long prev = 1, cur = 1;          // ways(0), ways(1)
        for (int i = 2; i <= n; i++) {
            long next = prev + cur;
            prev = cur;
            cur = next;
        }
        return cur;
    }
}
