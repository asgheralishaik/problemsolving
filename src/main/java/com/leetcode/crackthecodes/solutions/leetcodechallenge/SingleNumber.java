package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.*;
import java.util.stream.Stream;

public class SingleNumber {

    public int singleNumber(int[] nums) {


//        Arrays.sort(nums);
//        for (int i = 0; (i < nums.length) && (i + 2 < nums.length); i = i + 2) {
//            if (nums[i] != nums[i + 1]) {
//                return nums[i];
//            }
//        }
//
//        return nums[nums.length - 1];

        int a=0;
        for(int i:nums){
            a^=i;
        }
        return a;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{2, 1, 4, 4, 1, 3, 2, 9, 3}));
    }
}
