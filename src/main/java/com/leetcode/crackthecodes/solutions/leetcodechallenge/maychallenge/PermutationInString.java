package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import java.util.Arrays;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {


        char[] s1Arra = s1.toCharArray();
        char[] s2Arra = s2.toCharArray();

        Arrays.sort(s1Arra);
        Arrays.sort(s2Arra);

        if (new String(s1Arra).equals(new String(s2Arra))) return true;

        char firstChar = s1Arra[0];

        for (int i = 0; i < s2Arra.length; i++) {
            if (s2Arra[i] == firstChar) {

                for (int j = i+1; j <= s1.length() - 1; j++) {
                    if (s1Arra[j-i] != s2Arra[j]) {
                        return false;
                    }

                    if(j==s1.length()-1)return  true;
                }

            }

        }

        return true;
    }

    public static void main(String[] args) {
        PermutationInString permutationInString = new PermutationInString();
        System.out.println(permutationInString.checkInclusion("ab","eidboaoo"));
    }

}
