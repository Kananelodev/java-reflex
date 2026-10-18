package drills.p09_dp;

import java.io.*;
import java.util.*;

/**
 * K34 - Coin Change (fewest coins)  [Medium, target 12 min]
 *
 * Return the fewest coins needed to make amount, using unlimited coins of each value, or -1 if
 * it cannot be made. amount = 0 needs 0 coins.
 *
 * Example: coins [1, 2, 5], amount 11 -> 3 (5 + 5 + 1)
 */
public class CoinChange {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int a = 1; a <= amount; a++)
            for (int coin : coins)
                if (coin <= a && dp[a - coin] != Integer.MAX_VALUE)
                    dp[a] = Math.min(dp[a], dp[a - coin] + 1);
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
