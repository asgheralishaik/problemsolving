package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class BuyOrSellStocks2 {


    public int maxProfit(int[] prices) {

        int profit =0;
        for(int i=1;i<prices.length;i++) {
            int currentProfit=prices[i] - prices[i-1];
            if(currentProfit>0){
                profit+=currentProfit;
            }
        }
        return profit;
    }


    public static void main(String[] args) {

        BuyOrSellStocks2 buyOrSellStocks = new BuyOrSellStocks2();
        System.out.println(buyOrSellStocks.maxProfit(new int[]{1,2,3,4,5}));
    }
}
