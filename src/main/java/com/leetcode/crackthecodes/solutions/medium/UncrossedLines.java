package com.leetcode.crackthecodes.solutions.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UncrossedLines {
    public int maxUncrossedLines(int[] A, int[] B) {

        int[][] dp = new int[A.length + 1][B.length + 1];

        int aLen = A.length;
        int bLen = B.length;

        for (int i = 0; i < aLen; i++) {

            for (int j = 0; j < bLen; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }


        }
        return dp[aLen - 1][bLen - 1];

    }

    public static void main(String[] args) {
        UncrossedLines uncrossedLines = new UncrossedLines();
        System.out.println(uncrossedLines.maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2}));
    }
}
