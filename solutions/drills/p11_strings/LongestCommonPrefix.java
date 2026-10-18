package drills.p11_strings;

import java.io.*;
import java.util.*;

/**
 * K44 - Longest Common Prefix  [Easy, target 6 min]
 *
 * Return the longest prefix shared by every string in the array ("" if none or if the array is empty).
 *
 * Example: [flower, flow, flight] -> "fl"
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String s : strs) {
            int i = 0;
            while (i < prefix.length() && i < s.length() && prefix.charAt(i) == s.charAt(i)) i++;
            prefix = prefix.substring(0, i);
        }
        return prefix;
    }
}
