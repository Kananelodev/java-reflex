package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R05 - Sorting int[][] safely  [Reflex, target 3 min]
 *
 * Sort the pairs IN PLACE by first value ascending; when first values tie, by second value
 * DESCENDING. Return the same array. Values can be anywhere in the int range - a comparator
 * that uses subtraction will overflow and fail.
 */
public class SortPairs {

    public static int[][] sortPairs(int[][] pairs) {
        Arrays.sort(pairs, (x, y) -> x[0] != y[0] ? Integer.compare(x[0], y[0])
                                                   : Integer.compare(y[1], x[1]));
        return pairs;
    }
}
