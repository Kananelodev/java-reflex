package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R02 - Word frequency with HashMap.merge  [Reflex, target 3 min]
 *
 * Split text into words on any whitespace (spaces, tabs, newlines - possibly several in a row),
 * lowercase every word, and return a map word -> number of occurrences. Ignore empty strings.
 *
 * Example: "the cat The  dog" -> {the=2, cat=1, dog=1}
 */
public class WordFrequency {

    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> freq = new HashMap<>();
        for (String w : text.trim().split("\\s+")) {
            if (w.isEmpty()) continue;
            freq.merge(w.toLowerCase(), 1, Integer::sum);
        }
        return freq;
    }
}
