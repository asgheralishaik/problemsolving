package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int current_max=nums[0];
        int max_so_far=nums[0];

        for(int i=1;i<nums.length;i++){
            current_max = Math.max(nums[i],current_max+nums[i]);
            max_so_far = Math.max(max_so_far,current_max);
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
