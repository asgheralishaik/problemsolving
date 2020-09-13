package com.leetcode.crackthecodes.solutions.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else if (!(s.charAt(left) == s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        v.isPalindrome("A man, a plan, a canal: Panama");
    }
}
