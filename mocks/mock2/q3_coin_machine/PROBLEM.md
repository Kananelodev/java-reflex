# Coin Machine  (Hard, 45 points)

A machine pays out exactly `amount` cents using `n` coin values (unlimited coins of each value).
Print two lines:
1. the **fewest** coins that make `amount`, or `-1` if impossible
2. the **number of different combinations** that make `amount` (order does not matter, so
   1+2 and 2+1 are the same combination), modulo 1,000,000,007

`amount = 0` has 0 coins and exactly 1 combination (use nothing).

**Input:** the first line holds `n amount`; the second line holds the `n` distinct coin values.

**Constraints:** 1 <= n <= 100; 0 <= amount <= 100,000; 1 <= coin <= 100,000

### Sample input
```
3 11
1 2 5
```

### Sample output
```
3
11
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
