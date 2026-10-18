package drills.p07_bfs_grid;

import java.io.*;
import java.util.*;

/**
 * K25 - Number of Islands  [Medium, target 10 min]
 *
 * grid has '1' (land) and '0' (water). An island is land connected up/down/left/right.
 * Return the number of islands. You may modify the grid.
 * One test is a 1000 x 1000 island - recursive DFS will overflow the stack. Use BFS with a queue.
 */
public class NumberOfIslands {

    public static int numIslands(char[][] grid) {
        int rows = grid.length, cols = grid[0].length, count = 0;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] != '1') continue;
                count++;
                grid[r][c] = '0';
                Deque<int[]> q = new ArrayDeque<>();
                q.offer(new int[]{r, c});
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    for (int[] d : dirs) {
                        int nr = cur[0] + d[0], nc = cur[1] + d[1];
                        if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || grid[nr][nc] != '1') continue;
                        grid[nr][nc] = '0';
                        q.offer(new int[]{nr, nc});
                    }
                }
            }
        }
        return count;
    }
}
