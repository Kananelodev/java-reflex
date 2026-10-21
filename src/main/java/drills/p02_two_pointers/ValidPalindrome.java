package drills.p02_two_pointers;

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
        // TODO

        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int n = s.length();

        for (int i = 0; i<n/2; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }

        return true;
    }
}
