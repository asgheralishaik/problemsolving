package com.leetcode.crackthecodes.solutions.zalando;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test {

    public static void main(String[] args) {

        final String validReturnAgreements = "Return to hayneedle, Return to Hayneedle/Defective allowance";

        System.out.println(validReturnAgreements.equalsIgnoreCase("Return to Hayneedle"));

        Set<String> set = new HashSet<String>(Arrays.asList(validReturnAgreements.split(",")));
        set.contains("Return to Hayneedle".toLowerCase());



    }
}
