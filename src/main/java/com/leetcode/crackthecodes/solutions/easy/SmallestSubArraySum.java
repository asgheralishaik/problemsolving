package com.leetcode.crackthecodes.solutions.easy;

public class SmallestSubArraySum {

    public static int smallestSubArraySum(int[] nums, int targetSum) {

        int minWindowSize = Integer.MAX_VALUE;

        int windowStart = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum >= targetSum) {

                while (currentSum >= targetSum) {
                    minWindowSize = Math.min(minWindowSize, i - windowStart + 1);
                    currentSum -= nums[windowStart];
                    windowStart++;
                }

            }

        }
        return minWindowSize;

    }

    public static void main(String[] args) {

        System.out.println(SmallestSubArraySum.smallestSubArraySum(new int[]{4, 2, 2, 7, 8, 1, 2, 8, 10}, 8));
    }
}
