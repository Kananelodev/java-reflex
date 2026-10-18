package drills.p06_stack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.*;
import java.util.stream.*;
import static org.junit.jupiter.api.Assertions.*;

@Timeout(value = 3, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MinStackTest {

    @Test void classic() {
        MinStack s = new MinStack();
        s.push(-2); s.push(0); s.push(-3);
        assertEquals(-3, s.getMin());
        s.pop();
        assertEquals(0, s.top());
        assertEquals(-2, s.getMin());
    }
    @Test void duplicateMins() {
        MinStack s = new MinStack();
        s.push(1); s.push(1); s.push(2);
        s.pop(); s.pop();
        assertEquals(1, s.getMin());
    }
    @Test void manyOps() {
        MinStack s = new MinStack();
        for (int i = 100_000; i > 0; i--) s.push(i);
        for (int i = 1; i < 100_000; i++) { assertEquals(i, s.getMin()); s.pop(); }
        assertEquals(100_000, s.top());
    }
}
