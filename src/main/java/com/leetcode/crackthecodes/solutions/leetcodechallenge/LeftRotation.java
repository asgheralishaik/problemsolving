package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class LeftRotation {

    static int[] leftRotate(int[] arr, int d) {
        int[] res = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            int newIndex = (j + arr.length - d) % arr.length;
            res[newIndex] = arr[j];
        }
        return res;
    }
}
