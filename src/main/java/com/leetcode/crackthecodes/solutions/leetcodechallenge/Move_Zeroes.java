package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class Move_Zeroes {

    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeroIndex] = nums[i];
                zeroIndex++;
            }
        }

        while (zeroIndex < nums.length) {
            nums[zeroIndex] = 0;
            zeroIndex++;
        }


    }

    public static void main(String[] args) {

    }
}

