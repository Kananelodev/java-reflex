package drills.p03_sliding_window;

import java.io.*;
import java.util.*;

/**
 * K12 - Longest Repeating Character Replacement  [Medium, target 12 min]
 *
 * s has only uppercase A-Z. You may change at most k characters to any other uppercase letter.
 * Return the length of the longest substring that can be made of one repeated letter.
 *
 * Example: "ABAB", k = 2 -> 4; "AABABBA", k = 1 -> 4
 * Hint: a window is valid while (window length - count of its most common letter) <= k.
 */
public class CharacterReplacement {

    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0, maxFreq = 0, best = 0;
        for (int right = 0; right < s.length(); right++) {
            maxFreq = Math.max(maxFreq, ++count[s.charAt(right) - 'A']);
            while (right - left + 1 - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            best = Math.max(best, right - left + 1);
        }
        return best;
    }
}
