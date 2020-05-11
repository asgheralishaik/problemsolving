package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class HappyNumber {

    public boolean isHappy(int n) {

        Set<Integer> numbers = new HashSet<>();

        while (n < Integer.MAX_VALUE && n > Integer.MIN_VALUE) {
            if(numbers.add(n)) {
                n = sum(n);
                if (n == 1) {
                    return true;
                } else {
                    sum(n);
                }
            }else {
                return false;
            }
        }
        return false;


    }

    public int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 2);
            n = n / 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }

}
