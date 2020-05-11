package com.leetcode.crackthecodes.solutions.medium;

import java.util.ArrayList;
import java.util.List;

public class P0005_LongestPalindrome {

    public String longestPalindrome(String s) {
        String[] str = new String[1];
        if (s.length() <= 1) return s;
        for (int i = 0; i < s.length(); i++) {
            String result = getPalindrome(s.substring(i), str);
            if (result != "") {
                str[0] = result;
                return str[0];
            }
        }
        if(str[0]==null){
            return s.charAt(0) + "";
        }
        return str[0];
    }


    private String getPalindrome(String s, String[] finalResult) {
        if (s.length() > 1) {
            char[] arr = s.toCharArray();
            int ptr1 = 0;
            int ptr2 = s.length() - 1;
            int count = 0;
            while (count < s.length() && ptr1 <= ptr2) {
                if (arr[ptr1] == arr[ptr2]) {
                    ptr1++;
                    ptr2--;
                    count++;
                } else {
                    return getPalindrome(s.substring(0, s.length() - 1), finalResult);
                }
            }
            if (ptr1 == ptr2 || ((ptr1 > (count / 2)))) {
                if (finalResult[0] == null) {
                    finalResult[0] = s;
                }
                if (s.length() > finalResult[0].length()) {
                    finalResult[0] = s;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        P0005_LongestPalindrome p0005_longestPalindrome = new P0005_LongestPalindrome();
        p0005_longestPalindrome.longestPalindrome("ac");
    }
}
