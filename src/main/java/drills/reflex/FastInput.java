package drills.reflex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

/**
 * R11 - BufferedReader + StringTokenizer  [Reflex, target 3 min]
 *
 * input looks exactly like HackerRank stdin: the first line is n, the second line holds n
 * integers separated by one or more spaces. Return their sum as a long.
 * Read it with BufferedReader (over a StringReader) and StringTokenizer - the same code you
 * would write in main() with System.in.
 *
 * Example: "3\n1 2 3\n" -> 6
 */
public class FastInput {

    public static long sumFromInput(String input) throws IOException {
        BufferedReader br = new BufferedReader(new StringReader(input));
        // TODO
        
        String firsline = br.readLine();

        if(firsline == null) {
            return 0;
        }
        int n = Integer.parseInt(firsline.trim());

        String secondline = br.readLine();
        if (secondline == null) {
            return 0;
        }

        StringTokenizer st = new StringTokenizer(secondline);
        long sum = 0;

        for(int i = 0; i < n; i++) {
            if(st.hasMoreTokens()) {
                sum += Long.parseLong(st.nextToken());
            }
        }
        return sum;
    }
}
