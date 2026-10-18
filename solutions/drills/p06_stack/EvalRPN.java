package drills.p06_stack;

import java.io.*;
import java.util.*;

/**
 * K23 - Evaluate Reverse Polish Notation  [Medium, target 10 min]
 *
 * Evaluate an expression in Reverse Polish Notation. Tokens are integers (possibly negative,
 * like "-11") or one of + - * /. Division truncates toward zero (Java's normal int division).
 * The expression is always valid.
 *
 * Example: ["2", "1", "+", "3", "*"] -> 9
 */
public class EvalRPN {

    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String tok : tokens) {
            switch (tok) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "-" -> { int b = stack.pop(), a = stack.pop(); stack.push(a - b); }
                case "/" -> { int b = stack.pop(), a = stack.pop(); stack.push(a / b); }
                default -> stack.push(Integer.parseInt(tok));
            }
        }
        return stack.pop();
    }
}
