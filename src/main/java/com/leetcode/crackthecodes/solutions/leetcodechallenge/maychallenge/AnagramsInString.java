package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AnagramsInString {

    public List<Integer> findAnagrams(String s, String p) {


        List<Integer> result = new ArrayList<>();

        int[] parr = new int[26];
        for (char c : p.toCharArray()) {
            parr[c - 97]++;
        }


        for (int i = 0; i < s.length() - p.length(); i++) {
            int[] sarr = new int[26];
            for (int j = 0; j < p.length(); j++) {
                sarr[s.charAt(i+j) - 97]++;
            }

            if(match(sarr,parr)){
                result.add(i);
            }
        }
        return result;
    }

    private boolean match(int[] sarr, int[] parr) {

        for (int i = 0; i < 26; i++) {
            if (sarr[i] != parr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AnagramsInString anagramsInString = new AnagramsInString();
        anagramsInString.findAnagrams("cbaebabacd",
                "abc");
    }
}
