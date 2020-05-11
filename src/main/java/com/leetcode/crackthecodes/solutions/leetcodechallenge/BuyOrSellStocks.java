package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class BuyOrSellStocks {


    public int maxProfit(int[] prices) {

        int max_price = 0;
        int minValue = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else {
                max_price = Math.max(max_price, price - minValue);
            }
        }
        return max_price;
    }


    public static void main(String[] args) {

        BuyOrSellStocks buyOrSellStocks = new BuyOrSellStocks();
        System.out.println(buyOrSellStocks.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
