package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        long high = 100000;
        long low = 1;


        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sqrt = mid * mid;
            if (sqrt == num) {
                return true;
            } else if (sqrt < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        validPerfectSquare.isPerfectSquare(16);
    }
}
