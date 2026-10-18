import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) line = "";
        List<String> words = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        for (char c : line.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) cur.append(c);
            else if (cur.length() > 0) { words.add(cur.toString()); cur.setLength(0); }
        }
        if (cur.length() > 0) words.add(cur.toString());
        if (words.isEmpty()) { System.out.print("0\n-\n-\n"); return; }

        String longest = words.get(0);
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
            freq.merge(w.toLowerCase(), 1, Integer::sum);
        }
        String best = null;
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            if (best == null || e.getValue() > freq.get(best)
                    || (e.getValue().equals(freq.get(best)) && e.getKey().compareTo(best) < 0)) best = e.getKey();
        }
        System.out.print(words.size() + "\n" + longest + "\n" + best + "\n");
    }
}
