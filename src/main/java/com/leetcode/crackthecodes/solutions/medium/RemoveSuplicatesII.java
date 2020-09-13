package com.leetcode.crackthecodes.solutions.medium;

public class RemoveSuplicatesII {

    public int removeDuplicates(int[] nums) {

        if(nums==null || nums.length==0) return 0;

        int left = 2;
        for(int right=2;right<nums.length;right++) {
            if(nums[left-2]!=nums[right]){
                nums[left++] = nums[right];
            }
        }
        return left;
    }


    public static void main(String[] args) {
        RemoveSuplicatesII a = new RemoveSuplicatesII();
        a.removeDuplicates(new int[]{1,1,1,1,3,3,5,5});
    }
}
