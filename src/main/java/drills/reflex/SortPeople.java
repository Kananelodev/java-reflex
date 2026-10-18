package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R04 - Comparator chaining  [Reflex, target 3 min]
 *
 * Return a NEW list of the people sorted by age ascending, then by name alphabetically
 * when ages are equal. Do not modify the input list.
 */
public class SortPeople {

    public record Person(String name, int age) {}

    public static List<Person> sortByAgeThenName(List<Person> people) {
        // TODO
        return new ArrayList<>();
    }
}
