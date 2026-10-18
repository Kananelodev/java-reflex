import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        long[] w = new long[n];
        st = new StringTokenizer(br.readLine());
        long lo = 0, hi = 0;
        for (int i = 0; i < n; i++) {
            w[i] = Long.parseLong(st.nextToken());
            lo = Math.max(lo, w[i]);
            hi += w[i];
        }
        while (lo < hi) {                   // binary search on the answer
            long mid = lo + (hi - lo) / 2;
            if (daysNeeded(w, mid) <= d) hi = mid; else lo = mid + 1;
        }
        System.out.println(lo);
    }

    static int daysNeeded(long[] w, long cap) {
        int days = 1;
        long load = 0;
        for (long x : w) {
            if (load + x > cap) { days++; load = 0; }
            load += x;
        }
        return days;
    }
}
