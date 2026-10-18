# Trending Words  (Medium, 35 points)

Given `n` words, print the `k` most frequent ones, one per line, as `word count`.
Order by count (highest first); break ties alphabetically (smallest first).

**Input:** the first line holds `n k`. The `n` lowercase words follow, separated by spaces and/or
newlines (they may be spread over several lines).

**Constraints:** 1 <= n <= 300,000; 1 <= k <= number of distinct words; words have 1-10 letters.

### Sample input
```
8 2
loop java code
java loop
test java loop
```

### Sample output
```
java 3
loop 3
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
