package com.leetcode.crackthecodes.solutions.easy;

import com.leetcode.crackthecodes.solutions.leetcodechallenge.MaximumSubarray;

public class MaximunSubarrayK {

    public static int findMaximum(int nums[], int k) {

        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (i >= k - 1) {
                maxSoFar = Math.max(maxSoFar, currentSum);
                currentSum -= nums[i - (k - 1)];
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {

        MaximunSubarrayK.findMaximum(new int[]{4, 2, 1, 7, 8, 1, 2, 8,1, 0}, 3);
    }
}
