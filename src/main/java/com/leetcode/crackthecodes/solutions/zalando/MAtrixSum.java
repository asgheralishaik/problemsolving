package com.leetcode.crackthecodes.solutions.zalando;

public class MAtrixSum {
    public String solution(int U, int L, int[] C) {

        String firstString = "";
        String secondString = "";

        for (int i : C) {

            if (i == 2) {
                firstString = firstString + "1";
                secondString = secondString + "1";

            } else if (i == 1) {
                if (getSum(firstString) < U) {
                    firstString = firstString + "1";
                    secondString = secondString + "0";
                } else {
                    firstString = firstString + "0";
                    secondString = secondString + "1";
                }
            } else {
                firstString = firstString + "0";
                secondString = secondString + "0";
            }
        }
        if (getSum(firstString) == U && getSum(secondString) == L) {
            return firstString + "," + secondString;
        } else {
            return "IMPOSSIBLE";
        }

    }

    private int getSum(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        int val = Integer.valueOf(str);
        int sum = 0;
        while (val != 0) {
            int rem = val % 10;
            sum += rem;
            val = val / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        MAtrixSum m = new MAtrixSum();
        m.solution(2, 3, new int[]{2, 0, 2, 0});
    }


}
