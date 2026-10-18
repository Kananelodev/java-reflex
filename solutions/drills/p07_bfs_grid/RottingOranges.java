package drills.p07_bfs_grid;

import java.io.*;
import java.util.*;

/**
 * K27 - Rotting Oranges (multi-source BFS)  [Medium, target 12 min]
 *
 * 0 = empty, 1 = fresh orange, 2 = rotten orange. Every minute, fresh oranges next to a rotten one
 * (up/down/left/right) become rotten. Return the minutes until no fresh orange is left, or -1 if
 * some fresh orange can never rot.
 *
 * Example: [[2,1,1],[1,1,0],[0,1,1]] -> 4
 * Hint: put ALL rotten oranges in the queue at the start, then BFS level by level.
 */
public class RottingOranges {

    public static int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length, fresh = 0;
        Deque<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) q.offer(new int[]{r, c});
                else if (grid[r][c] == 1) fresh++;
            }
        int minutes = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty() && fresh > 0) {
            for (int size = q.size(); size > 0; size--) {
                int[] cur = q.poll();
                for (int[] d : dirs) {
                    int r = cur[0] + d[0], c = cur[1] + d[1];
                    if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != 1) continue;
                    grid[r][c] = 2;
                    fresh--;
                    q.offer(new int[]{r, c});
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}
