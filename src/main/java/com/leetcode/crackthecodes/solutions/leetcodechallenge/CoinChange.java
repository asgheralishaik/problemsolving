package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class CoinChange {

    static int coinProblem(int amount,int [] coins) {
        int[] combinations = new int[amount+1];
        combinations[0] = 1;

        for(int coin:coins) {
            for(int i=1;i<combinations.length;i++){
                if(i>=coin){
                    combinations[i]+=combinations[i-coin];
                }
            }
        }

        return combinations[amount];
    }
}
