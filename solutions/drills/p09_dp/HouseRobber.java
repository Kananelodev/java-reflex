package drills.p09_dp;

import java.io.*;
import java.util.*;

/**
 * K35 - House Robber  [Medium, target 10 min]
 *
 * You cannot take money from two adjacent houses. Return the maximum total you can take.
 * Must be O(n): one test has 100,000 houses.
 *
 * Example: [2, 7, 9, 3, 1] -> 12 (2 + 9 + 1); [2, 1, 1, 2] -> 4
 */
public class HouseRobber {

    public static int rob(int[] nums) {
        int take = 0, skip = 0;          // best ending with / without taking the previous house
        for (int x : nums) {
            int newTake = skip + x;
            skip = Math.max(skip, take);
            take = newTake;
        }
        return Math.max(take, skip);
    }
}
