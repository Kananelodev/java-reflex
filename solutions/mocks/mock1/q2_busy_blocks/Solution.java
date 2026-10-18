import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] iv = new int[n][2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            iv[i][0] = Integer.parseInt(st.nextToken());
            iv[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(iv, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        for (int[] cur : iv) {
            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= cur[0]) {
                int[] last = res.get(res.size() - 1);
                last[1] = Math.max(last[1], cur[1]);
            } else res.add(new int[]{cur[0], cur[1]});
        }
        StringBuilder out = new StringBuilder().append(res.size()).append('\n');
        for (int[] b : res) out.append(b[0]).append(' ').append(b[1]).append('\n');
        System.out.print(out);
    }
}
