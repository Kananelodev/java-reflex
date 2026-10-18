package drills.p06_stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class ValidParenthesesTest {

    @Test void simple() { assertTrue(ValidParentheses.isValid("()")); }
    @Test void sequence() { assertTrue(ValidParentheses.isValid("()[]{}")); }
    @Test void wrongType() { assertFalse(ValidParentheses.isValid("(]")); }
    @Test void crossed() { assertFalse(ValidParentheses.isValid("([)]")); }
    @Test void nested() { assertTrue(ValidParentheses.isValid("{[]}")); }
    @Test void empty() { assertTrue(ValidParentheses.isValid("")); }
    @Test void unclosed() { assertFalse(ValidParentheses.isValid("((")); }
    @Test void closeFirst() { assertFalse(ValidParentheses.isValid("]")); }
}
