package com.leetcode.crackthecodes.solutions.easy;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class P0125_ValidPalindrome {

    private static int[] valueMap = new int[127];

    static {
        for (int l=0;l < 127; l++) {
            if(l <= 122 && l>= 97) {
                valueMap[l] = 122-l;
            } else if (l<=90 && l>=65){
                valueMap[l] = 90-l;
            } else if(l >= 48 && l <= 57) {
                valueMap[l]=l;
            } else
                valueMap[l] = -1;
        }
    }
    public boolean isPalindrome(String s) {
        if (s.trim().length()==0 || s.length()==1)
            return true;
        char [] array = s.trim().toCharArray();
        int x = 0, y = array.length - 1;
        int i = -1, j = -1;
        while (x < y) {
            i =  valueMap[array[x]];
            j = valueMap[array[y]];
            if(i == j) {
                x++;
                y--;
                i = -1;
                j = -1;
            } else if(i == -1) {
                x++;
            } else if(j == -1) {
                y--;
            } else {
                return false;
            }
        }
        return true;
    }

}
