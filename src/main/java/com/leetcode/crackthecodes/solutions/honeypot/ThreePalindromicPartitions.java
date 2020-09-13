package com.leetcode.crackthecodes.solutions.honeypot;

import java.util.*;

public class ThreePalindromicPartitions {

    static HashMap<String,Integer> solutions = new HashMap<String, Integer>();

    static List<String> result = new ArrayList<>();
    public static List<String> threePalindromicSubstrings(String word) {

        splitDP(word);

        result.removeIf(p->p.equals(""));
        return result;
    }

    public static int splitDP(String x){
            int cuts = 3;
            for (int i = 1; i <x.length() ; i++) {
                int leftSolution =0;
                int rightSolution = 0;
                String leftPart = x.substring(0,i);
                String rightPart = x.substring(i,x.length());
                if(solutions.containsKey(leftPart)){
                    leftSolution = solutions.get(leftPart);
                }else{
                    leftSolution = splitDP(leftPart);
                    solutions.put(leftPart,leftSolution);
                }
                if(solutions.containsKey(rightPart)){
                    rightSolution = solutions.get(rightPart);
                }else{
                    rightSolution = splitDP(rightPart);
                    solutions.put(rightPart,rightSolution);
                }
                cuts  = Math.min(1+ leftSolution  + rightSolution,cuts);
            }
            return cuts;

    }


    public static boolean isPalindrome(String s){
        int n = s.length();
        for (int i=0;i<(n / 2) + 1;++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ThreePalindromicPartitions.threePalindromicSubstrings("tenet");
    }


}
