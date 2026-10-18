package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R03 - Grouping with computeIfAbsent  [Reflex, target 3 min]
 *
 * Return a map from word length -> list of the words with that length, keeping the words
 * in the same order they appear in the input.
 *
 * Example: [hi, cat, yo, dog] -> {2=[hi, yo], 3=[cat, dog]}
 */
public class GroupByLength {

    public static Map<Integer, List<String>> groupByLength(List<String> words) {
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String w : words) {
            groups.computeIfAbsent(w.length(), k -> new ArrayList<>()).add(w);
        }
        return groups;
    }
}
