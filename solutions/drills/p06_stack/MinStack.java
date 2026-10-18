package drills.p06_stack;

import java.io.*;
import java.util.*;

/**
 * K24 - Min Stack (design a class)  [Medium, target 10 min]
 *
 * Implement a stack that supports push, pop, top and getMin - ALL in O(1).
 * pop/top/getMin are only called on a non-empty stack.
 *
 * Hint: store each value together with the minimum at the time it was pushed.
 */
public class MinStack {

    private final Deque<int[]> stack = new ArrayDeque<>();   // {value, min so far}

    public void push(int x) {
        int min = stack.isEmpty() ? x : Math.min(x, stack.peek()[1]);
        stack.push(new int[]{x, min});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
