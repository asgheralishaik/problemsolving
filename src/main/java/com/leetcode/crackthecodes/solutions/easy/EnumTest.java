package com.leetcode.crackthecodes.solutions.easy;

public enum EnumTest {

    TYPE1(4.5, "string1"), TYPE2(2.79, "string2");
    double num;
    String st;

     EnumTest(double num, String st) {
        this.num = num;
        this.st = st;
    }

}
