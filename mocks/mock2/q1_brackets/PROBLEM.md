# Bracket Check  (Easy, 20 points)

For each of `t` lines, print `YES` if its brackets `()`, `[]`, `{}` are balanced and correctly
nested, otherwise `NO`. Any other characters (letters, digits, spaces, operators) are ignored.
A line with no brackets at all is balanced.

**Input:** `t`, then `t` lines (each has at least one character).

**Constraints:** 1 <= t <= 1,000; total length of all lines <= 1,000,000.

### Sample input
```
4
{[()]}
([)]
f(x) = [a + b] * {c}
((
```

### Sample output
```
YES
NO
YES
NO
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
