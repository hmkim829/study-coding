package leetcode_inflearn;

import java.util.Arrays;

// 322. Coin Change
// https://leetcode.com/problems/coin-change/
public class CoinChange {

    public static void main(String[] args) {

        int[] coins = {186,419,83,408};
        int amount = 6249;

        CoinChange prob = new CoinChange();
        System.out.println(prob.coinChange(coins, amount));
    }

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        int max = amount+1;

        Arrays.fill(dp, max);
        dp[0] = 0;

        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
