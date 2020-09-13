package com.leetcode.crackthecodes.solutions.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test {



    public static boolean test() {
        boolean isItemReturnableToHayneedle = false;

            final String validReturnAgreements = "Return to hayneedle, Return to Hayneedle/Defective allowance";
            List<String> returnAgreements = Arrays.asList(validReturnAgreements.split(","));
            for (String eachAgreement : returnAgreements) {
                if (eachAgreement.toLowerCase().contains("Return to Hayneedle".toLowerCase())) {
                    isItemReturnableToHayneedle = true;
                    break;
                }
            }
        return isItemReturnableToHayneedle;

    }

    public static void main(String[] args) {
        System.out.println(Test.test());
    }
}


