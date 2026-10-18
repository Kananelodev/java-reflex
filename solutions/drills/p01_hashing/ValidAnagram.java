package drills.p01_hashing;

import java.io.*;
import java.util.*;

/**
 * K01 - Valid Anagram  [Easy, target 5 min]
 *
 * Return true if t is an anagram of s (same letters, same counts). Both contain only lowercase a-z.
 *
 * Example: ("anagram", "nagaram") -> true, ("rat", "car") -> false
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }
}
