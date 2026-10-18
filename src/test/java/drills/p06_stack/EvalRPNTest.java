package drills.p06_stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class EvalRPNTest {

    @Test void basic() { assertEquals(9, EvalRPN.evalRPN(new String[]{"2", "1", "+", "3", "*"})); }
    @Test void division() { assertEquals(6, EvalRPN.evalRPN(new String[]{"4", "13", "5", "/", "+"})); }
    @Test void negativeNumbers() {
        assertEquals(22, EvalRPN.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }
    @Test void truncation() { assertEquals(-3, EvalRPN.evalRPN(new String[]{"-7", "2", "/"})); }
    @Test void orderMatters() { assertEquals(2, EvalRPN.evalRPN(new String[]{"5", "3", "-", "1", "*"})); }
    @Test void single() { assertEquals(42, EvalRPN.evalRPN(new String[]{"42"})); }
}
