package drills.p02_two_pointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidPalindromeTest {

    @Test void classic() { assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama")); }
    @Test void no() { assertFalse(ValidPalindrome.isPalindrome("race a car")); }
    @Test void onlySpace() { assertTrue(ValidPalindrome.isPalindrome(" ")); }
    @Test void digitVsLetter() { assertFalse(ValidPalindrome.isPalindrome("0P")); }
    @Test void empty() { assertTrue(ValidPalindrome.isPalindrome("")); }
}
