package com.example;


public class lc322CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int sum=0;
        for (int coin : coins) {
            sum += coin;
        }
        if(sum<amount)
            return -1;
        return 1;
    }
}
