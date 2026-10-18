package drills.p03_sliding_window;

import java.io.*;
import java.util.*;

/**
 * K10 - Longest Substring Without Repeating Characters  [Medium, target 10 min]
 *
 * Return the length of the longest substring of s with no repeated characters.
 *
 * Example: "abcabcbb" -> 3 ("abc"), "bbbbb" -> 1, "pwwkew" -> 3
 * Watch out for "abba": the left edge must never move backwards.
 */
public class LongestUniqueSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> last = new HashMap<>();
        int best = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (last.containsKey(c) && last.get(c) >= left) left = last.get(c) + 1;
            last.put(c, right);
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
