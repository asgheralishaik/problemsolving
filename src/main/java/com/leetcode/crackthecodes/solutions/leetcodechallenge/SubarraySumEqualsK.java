package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,1);
        int sum = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum==k || hashMap.containsKey(sum - k)) {
                result += hashMap.get(sum-k);
            }

            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK subarraySumEqualsK =  new SubarraySumEqualsK();
        subarraySumEqualsK.subarraySum(new int[]{1,1,1},2);
    }

}
