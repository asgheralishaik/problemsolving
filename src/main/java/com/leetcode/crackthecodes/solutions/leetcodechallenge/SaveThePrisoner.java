package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class SaveThePrisoner {

    static int saveThePrisoner(int n,int m, int s){
        int rem = m%n;
        if((rem +s-1)%n ==0){
            return n;
        }else {
            return (rem +s-1)%n;
        }
    }
}
