package drills.p11_strings;

import java.io.*;
import java.util.*;

/**
 * K45 - String Rotation  [Easy, target 5 min]
 *
 * Return true if b can be obtained by rotating a (moving some prefix of a to its end).
 *
 * Example: ("waterbottle", "erbottlewat") -> true, ("abc", "acb") -> false
 * Hint: every rotation of a appears inside a + a.
 */
public class StringRotation {

    public static boolean isRotation(String a, String b) {
        return a.length() == b.length() && (a + a).contains(b);
    }
}
