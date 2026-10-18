package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R08 - Split, reverse, join  [Reflex, target 3 min]
 *
 * Reverse the order of the words in s. Words are separated by one or more spaces; the result
 * has single spaces between words and no leading/trailing spaces.
 *
 * Example: "  the sky  is blue " -> "blue is sky the"
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        String trimmed = s.trim();
        if (trimmed.isEmpty()) return "";
        List<String> words = Arrays.asList(trimmed.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
