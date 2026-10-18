package drills.p01_hashing;

import java.io.*;
import java.util.*;

/**
 * K04 - Group Anagrams  [Medium, target 8 min]
 *
 * Group the words that are anagrams of each other. Groups appear in the order their first word
 * appears in the input, and words inside a group keep their input order.
 *
 * Example: [eat, tea, tan, ate, nat, bat] -> [[eat, tea, ate], [tan, nat], [bat]]
 * Hint: a sorted copy of the letters makes a good map key. LinkedHashMap keeps insertion order.
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> groups = new LinkedHashMap<>();
        for (String w : words) {
            char[] cs = w.toCharArray();
            Arrays.sort(cs);
            groups.computeIfAbsent(new String(cs), k -> new ArrayList<>()).add(w);
        }
        return new ArrayList<>(groups.values());
    }
}
