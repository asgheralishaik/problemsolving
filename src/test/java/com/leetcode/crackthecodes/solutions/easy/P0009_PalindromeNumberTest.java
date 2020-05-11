package com.leetcode.crackthecodes.solutions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class P0009_PalindromeNumberTest {

    private P0009_PalindromeNumber object = new P0009_PalindromeNumber();

    @ParameterizedTest
    @ValueSource(ints= {121,131,56465,0,0xB})
    void isPalindrome_validNumbers(int num) {
        Assertions.assertTrue(object.isPalindrome(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {-121,543,-1,0x4f})
    void isPalindrome_invalidNumbers(int num) {
        Assertions.assertFalse(object.isPalindrome(num));
    }



}