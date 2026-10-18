package drills.p06_stack;

import java.io.*;
import java.util.*;

/**
 * K21 - Valid Parentheses  [Easy, target 6 min]
 *
 * s contains only ()[]{}. Return true if every bracket is closed by the same type, in the
 * correct order.
 *
 * Example: "()[]{}" -> true, "([)]" -> false, "{[]}" -> true
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == ']' && open != '[') || (c == '}' && open != '{')) return false;
            }
        }
        return stack.isEmpty();
    }
}
