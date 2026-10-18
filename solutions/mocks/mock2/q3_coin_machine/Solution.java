import java.io.*;
import java.util.*;

public class Solution {
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), amount = Integer.parseInt(st.nextToken());
        int[] coins = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) coins[i] = Integer.parseInt(st.nextToken());

        int[] fewest = new int[amount + 1];
        Arrays.fill(fewest, Integer.MAX_VALUE);
        fewest[0] = 0;
        for (int a = 1; a <= amount; a++)
            for (int c : coins)
                if (c <= a && fewest[a - c] != Integer.MAX_VALUE)
                    fewest[a] = Math.min(fewest[a], fewest[a - c] + 1);

        long[] ways = new long[amount + 1];   // coins in the OUTER loop -> combinations, not orderings
        ways[0] = 1;
        for (int c : coins)
            for (int a = c; a <= amount; a++)
                ways[a] = (ways[a] + ways[a - c]) % MOD;

        System.out.println(fewest[amount] == Integer.MAX_VALUE ? -1 : fewest[amount]);
        System.out.println(ways[amount]);
    }
}
