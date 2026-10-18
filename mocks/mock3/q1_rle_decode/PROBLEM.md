# Decode the Log  (Easy, 20 points)

A log is compressed with run-length encoding: each letter is followed by an optional count
(one or more digits). A missing count means 1. Print the decoded string.

Example: `a3b2c` decodes to `aaabbc`; `x12y` decodes to twelve `x` followed by `y`.

**Input:** one non-empty line containing letters and digits; it always starts with a letter and
every count is >= 1.

**Constraints:** the decoded string has at most 1,000,000 characters.

### Sample input
```
a3b2c
```

### Sample output
```
aaabbc
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
