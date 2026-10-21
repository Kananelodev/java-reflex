package drills.p01_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * K01 - Valid Anagram  [Easy, target 5 min]
 *
 * Return true if t is an anagram of s (same letters, same counts). Both contain only lowercase a-z.
 *
 * Example: ("anagram", "nagaram") -> true, ("rat", "car") -> false
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        // TODO

        Map<Character, Integer> yes = new HashMap<>();
        Map<Character, Integer> yep = new HashMap<>();

        if(t.length() != s.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            yes.put(s.charAt(i), yes.getOrDefault(s.charAt(i), 0) + 1);
            yep.put(t.charAt(i), yep.getOrDefault(t.charAt(i), 0) + 1);
        }

        return yes.equals(yep);

    }


}
