import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Map<Long, Integer> seen = new HashMap<>();
        seen.put(0L, 1);
        long sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
            count += seen.getOrDefault(sum - k, 0);
            seen.merge(sum, 1, Integer::sum);
        }
        System.out.println(count);
    }
}
