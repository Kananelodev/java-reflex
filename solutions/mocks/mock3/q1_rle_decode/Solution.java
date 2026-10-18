import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i++);
            int j = i;
            while (j < s.length() && Character.isDigit(s.charAt(j))) j++;
            int count = j > i ? Integer.parseInt(s.substring(i, j)) : 1;
            out.append(String.valueOf(ch).repeat(count));
            i = j;
        }
        System.out.println(out);
    }
}
