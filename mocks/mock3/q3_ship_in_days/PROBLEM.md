# Ship Within D Days  (Hard, 45 points)

`n` packages with weights `w[0..n-1]` must be shipped **in the given order** within `d` days.
Each day the truck is loaded with consecutive packages, never exceeding its capacity
(packages cannot be split). Print the minimum truck capacity that ships everything within `d` days.

**Input:** the first line holds `n d`; the second line holds the `n` weights.

**Constraints:** 1 <= d <= n <= 100,000; 1 <= w[i] <= 500,000,000
(the answer can exceed 2^31).

### Sample input
```
10 5
1 2 3 4 5 6 7 8 9 10
```

### Sample output
```
15
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
