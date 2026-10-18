import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        Map<String, Integer> freq = new HashMap<>();
        int read = 0;
        while (read < n) {
            String line = br.readLine();
            if (line == null) break;
            st = new StringTokenizer(line);
            while (st.hasMoreTokens() && read < n) { freq.merge(st.nextToken(), 1, Integer::sum); read++; }
        }
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(freq.entrySet());
        entries.sort((a, b) -> !a.getValue().equals(b.getValue()) ? Integer.compare(b.getValue(), a.getValue())
                                                                   : a.getKey().compareTo(b.getKey()));
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < k; i++) out.append(entries.get(i).getKey()).append(' ').append(entries.get(i).getValue()).append('\n');
        System.out.print(out);
    }
}
