package com.leetcode.crackthecodes.solutions.easy;

/**
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 * Note that elements beyond the length of the original array are not written.
 *
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,0,2,3,0,4,5,0]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 * Example 2:
 *
 * Input: [1,2,3]
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 * Note:
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 */
public class P1089_DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int temp[] = new int[arr.length];
        for(int i =0 ;i < arr.length; i++)
            temp[i] = arr[i];
        boolean flag = false;
        for(int i=0, j =0; i < arr.length; j++,i++) {
            if(flag) {
                arr[i] = temp[j];
            }
            if (temp[j] == 0 && i+1 < arr.length) {
                arr[++i] = 0;
                flag = true;
            }
        }
    }
}
