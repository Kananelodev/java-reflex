import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int rows = Integer.parseInt(st.nextToken()), cols = Integer.parseInt(st.nextToken());
        char[][] g = new char[rows][];
        int start = 0, exit = 0;
        for (int r = 0; r < rows; r++) {
            g[r] = br.readLine().toCharArray();
            for (int c = 0; c < cols; c++) {
                if (g[r][c] == 'S') start = r * cols + c;
                if (g[r][c] == 'E') exit = r * cols + c;
            }
        }
        // state = (cell, drillUsed); BFS over both layers
        int[][] dist = new int[2][rows * cols];
        for (int[] d : dist) Arrays.fill(d, -1);
        ArrayDeque<int[]> q = new ArrayDeque<>();
        dist[0][start] = 0;
        q.offer(new int[]{start, 0});
        int[] dr = {1, -1, 0, 0}, dc = {0, 0, 1, -1};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0] / cols, c = cur[0] % cols, used = cur[1];
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k], nc = c + dc[k];
                if (nr < 0 || nc < 0 || nr >= rows || nc >= cols) continue;
                int nu = used + (g[nr][nc] == '#' ? 1 : 0);
                if (nu > 1) continue;
                int ni = nr * cols + nc;
                if (dist[nu][ni] != -1) continue;
                dist[nu][ni] = dist[used][cur[0]] + 1;
                q.offer(new int[]{ni, nu});
            }
        }
        int a = dist[0][exit], b = dist[1][exit];
        int ans = a == -1 ? b : (b == -1 ? a : Math.min(a, b));
        System.out.println(ans);
    }
}
