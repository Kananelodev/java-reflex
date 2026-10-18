package drills.p01_hashing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidAnagramTest {

    @Test void yes() { assertTrue(ValidAnagram.isAnagram("anagram", "nagaram")); }
    @Test void no() { assertFalse(ValidAnagram.isAnagram("rat", "car")); }
    @Test void bothEmpty() { assertTrue(ValidAnagram.isAnagram("", "")); }
    @Test void differentLengths() { assertFalse(ValidAnagram.isAnagram("a", "ab")); }
    @Test void sameLettersDifferentCounts() { assertFalse(ValidAnagram.isAnagram("aab", "abb")); }
}
