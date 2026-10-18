package drills.p11_strings;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StringRotationTest {

    @Test void yes() { assertTrue(StringRotation.isRotation("waterbottle", "erbottlewat")); }
    @Test void no() { assertFalse(StringRotation.isRotation("abc", "acb")); }
    @Test void empty() { assertTrue(StringRotation.isRotation("", "")); }
    @Test void lengthDiffers() { assertFalse(StringRotation.isRotation("a", "aa")); }
    @Test void same() { assertTrue(StringRotation.isRotation("abc", "abc")); }
}
