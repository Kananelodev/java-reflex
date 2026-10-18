# Warehouse Robot  (Hard, 45 points)

A robot moves on an `R x C` warehouse floor. Cells are `.` (open), `#` (shelf), `S` (start) and
`E` (exit). Each step moves one cell up, down, left or right and stays inside the grid.

The robot carries **one** use of a drill: at most once during its trip it may step **into** a
`#` cell (the shelf is removed). Print the minimum number of steps from `S` to `E`, or `-1` if the
exit cannot be reached even with the drill.

**Input:** the first line holds `R C`, followed by `R` lines of `C` characters.

**Constraints:** 1 <= R, C <= 500; exactly one `S` and one `E`.

### Sample input
```
3 4
S#..
##.#
...E
```

### Sample output
```
5
```

Write your solution in `Solution.java` in this folder (class name must stay `Solution`).
