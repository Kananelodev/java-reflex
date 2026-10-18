# Busy Blocks  (Medium, 35 points)

A calendar has `n` meetings. Meeting `i` occupies the time interval `[s, e)`.
Merge every group of meetings that overlap **or touch** (a meeting ending at 5 and one starting at 5
form one block) and print the resulting busy blocks.

**Input:** the first line holds `n`. Each of the next `n` lines holds `s e`. Meetings are in no
particular order.

**Output:** the number of busy blocks on the first line, then each block as `s e`, ordered by start.

**Constraints:** 1 <= n <= 200,000; 0 <= s < e <= 1,000,000,000

### Sample input
```
5
8 10
1 3
2 6
15 18
10 12
```

### Sample output
```
3
1 6
8 12
15 18
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
