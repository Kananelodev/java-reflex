package drills.reflex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        // TODO

        Map<Integer, List<String>> see = new HashMap<>();

        for(String n : words) {
            char[] charArray = n.toCharArray();
            int len = charArray.length;

            see.computeIfAbsent(len, k -> new ArrayList<>()).add(n);
            
            
        

            // if (!see.containsKey(len)) {
            //     see.put(len, new ArrayList<>());
            // }

            // see.get(len).add(n);

        }

        return see;
    }
}
