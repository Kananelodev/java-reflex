package drills.p11_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CaesarCipherTest {

    @Test void basic() { assertEquals("bcd", CaesarCipher.caesar("abc", 1)); }
    @Test void wrap() { assertEquals("abc", CaesarCipher.caesar("xyz", 3)); }
    @Test void sentence() { assertEquals("Mjqqt, Btwqi!", CaesarCipher.caesar("Hello, World!", 5)); }
    @Test void negative() { assertEquals("zab", CaesarCipher.caesar("abc", -1)); }
    @Test void fullCircle() { assertEquals("abc", CaesarCipher.caesar("abc", 52)); }
    @Test void bigNegative() { assertEquals("zab", CaesarCipher.caesar("abc", -27)); }
    @Test void hugeK() { assertEquals("ABC", CaesarCipher.caesar("ABC", 26 * 1000)); }
}
