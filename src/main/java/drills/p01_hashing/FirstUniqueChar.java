package drills.p01_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * K03 - First Unique Character  [Easy, target 5 min]
 *
 * Return the index of the first character in s that appears exactly once, or -1 if none.
 * s contains only lowercase a-z.
 *
 * Example: "leetcode" -> 0, "loveleetcode" -> 2, "aabb" -> -1
 */
public class FirstUniqueChar {

    public static int firstUniqChar(String s) {
        // TODO

        Map<Character, Integer> seeMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            seeMap.put(s.charAt(i), seeMap.getOrDefault(s.charAt(i), 0) + 1) ;
            
        }  
        
        for (int i = 0; i < s.length(); i++) {

            if(seeMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
