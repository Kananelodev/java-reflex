package drills.p07_bfs_grid;

import java.io.*;
import java.util.*;

/**
 * K28 - Flood Fill  [Easy, target 8 min]
 *
 * Starting from pixel (sr, sc), recolor it and every pixel connected to it (up/down/left/right)
 * that has the SAME original color, to the new color. Return the image (modify in place is fine).
 * Traps: if the new color equals the old one, do nothing (otherwise you loop forever), and one test
 * is 1000 x 1000 - recursion will overflow the stack.
 */
public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        if (old == color) return image;
        int rows = image.length, cols = image[0].length;
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Deque<int[]> q = new ArrayDeque<>();
        image[sr][sc] = color;
        q.offer(new int[]{sr, sc});
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dirs) {
                int r = cur[0] + d[0], c = cur[1] + d[1];
                if (r < 0 || c < 0 || r >= rows || c >= cols || image[r][c] != old) continue;
                image[r][c] = color;
                q.offer(new int[]{r, c});
            }
        }
        return image;
    }
}
