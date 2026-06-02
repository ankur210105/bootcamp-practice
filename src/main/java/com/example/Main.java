package com.example;


import static com.example.basicRecursion.show;
import static com.example.lc322CoinChange.coinChange;

public class Main {

    public static void main(String[] args) {

        show(1);// basic recursion practice
        //with backtracking
        int [] coins= new int[]{1, 2, 5};
        int amount=11;
        System.out.println(coinChange(coins,amount));

    }
}
