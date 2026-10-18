package drills.p07_bfs_grid;

import java.io.*;
import java.util.*;

/**
 * K26 - Shortest Path in Binary Matrix  [Medium, target 12 min]
 *
 * n x n grid of 0 (open) and 1 (blocked). Moving in any of the 8 directions, return the length of
 * the shortest path from top-left to bottom-right counted in CELLS (start and end included),
 * or -1 if there is none (including when start or end is blocked).
 *
 * Example: [[0,1],[1,0]] -> 2
 */
public class ShortestPathBinaryMatrix {

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
        int[][] dist = new int[n][n];
        dist[0][0] = 1;
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{0, 0});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (cur[0] == n - 1 && cur[1] == n - 1) return dist[cur[0]][cur[1]];
            for (int dr = -1; dr <= 1; dr++) {
                for (int dc = -1; dc <= 1; dc++) {
                    int r = cur[0] + dr, c = cur[1] + dc;
                    if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] == 1 || dist[r][c] != 0) continue;
                    dist[r][c] = dist[cur[0]][cur[1]] + 1;
                    q.offer(new int[]{r, c});
                }
            }
        }
        return -1;
    }
}
