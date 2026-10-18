package drills.p02_two_pointers;

import java.io.*;
import java.util.*;

/**
 * K05 - Valid Palindrome  [Easy, target 6 min]
 *
 * Return true if s reads the same forwards and backwards after lowercasing and removing every
 * character that is not a letter or digit.
 *
 * Example: "A man, a plan, a canal: Panama" -> true, "race a car" -> false
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char a = s.charAt(i), b = s.charAt(j);
            if (!Character.isLetterOrDigit(a)) { i++; continue; }
            if (!Character.isLetterOrDigit(b)) { j--; continue; }
            if (Character.toLowerCase(a) != Character.toLowerCase(b)) return false;
            i++; j--;
        }
        return true;
    }
}
