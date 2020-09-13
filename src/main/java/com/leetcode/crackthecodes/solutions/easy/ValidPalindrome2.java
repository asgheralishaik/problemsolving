package com.leetcode.crackthecodes.solutions.easy;

public class ValidPalindrome2 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right && (left < s.length()/2)) {



            int asciiValueLeft = Character.toLowerCase(s.charAt(left));
            int asciiValueRight = Character.toLowerCase(s.charAt(right));
            if (asciiValueLeft == asciiValueRight) {
                left++;
                right--;
            } else if (!(asciiValueLeft >= 97 && asciiValueLeft <= 122)) {
                left++;

            } else if (!(asciiValueRight >= 97 && asciiValueRight <= 122)) {
                right--;

            }else {
                return false;
            }
        }
        if (left == right || (left-1==right)) return true;

        return false;

    }

    public static void main(String[] args) {
        ValidPalindrome2 v = new ValidPalindrome2();
        v.isPalindrome("aa");
    }
}
