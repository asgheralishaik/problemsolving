package com.leetcode.crackthecodes.solutions.medium;

public class RemoveDuplicatesII {

    public int removeDuplicates(int[] nums) {

        if(nums==null || nums.length==0) return 0;

        int i=0;
        for(int n:nums) {
            if(i<2 || nums[i-2] <n) {
                nums[i++]=n;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesII s = new RemoveDuplicatesII();
        s.removeDuplicates(new int[]{1,1,1,2,2,3});
    }


}
