package drills.p08_sort_greedy;

import java.io.*;
import java.util.*;

/**
 * K32 - Largest Number (custom comparator)  [Medium, target 10 min]
 *
 * Arrange the non-negative numbers so that, concatenated, they form the largest number.
 * Return it as a String.
 *
 * Example: [3, 30, 34, 5, 9] -> "9534330"; [0, 0] -> "0"
 * Hint: put a before b when (a + b) > (b + a) as strings.
 */
public class LargestNumber {

    public static String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) s[i] = String.valueOf(nums[i]);
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        if (s[0].equals("0")) return "0";
        return String.join("", s);
    }
}
