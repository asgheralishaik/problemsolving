package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class PlaindromeIndex {

    static int palindromeIndex(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s.substring(i + 1, s.length()-i))) {
                    return i;
                } else {
                    return s.length() - i - 1;
                }
            }
            i++;
            j--;
        }
        return -1;
    }

    static boolean isPalindrome(String s) {
            for (int i = 0; i < s.length() / 2; i++) {

            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PlaindromeIndex plaindromeIndex = new PlaindromeIndex();
        palindromeIndex("aaab");
    }
}
