package drills.reflex;

import java.io.*;
import java.util.*;

/**
 * R10 - BFS on a grid  [Reflex, target 5 min]
 *
 * grid[r][c] is '.' (open) or '#' (wall). Starting at (sr, sc), return an int[R][C] with the
 * minimum number of 4-directional steps to every cell. Walls and unreachable cells get -1.
 */
public class GridBfs {

    public static int[][] bfs(char[][] grid, int sr, int sc) {
        int rows = grid.length, cols = grid[0].length;
        int[][] dist = new int[rows][cols];
        for (int[] row : dist) Arrays.fill(row, -1);
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sr, sc});
        dist[sr][sc] = 0;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dirs) {
                int r = cur[0] + d[0], c = cur[1] + d[1];
                if (r < 0 || c < 0 || r >= rows || c >= cols) continue;
                if (grid[r][c] == '#' || dist[r][c] != -1) continue;
                dist[r][c] = dist[cur[0]][cur[1]] + 1;
                q.offer(new int[]{r, c});
            }
        }
        return dist;
    }
}
