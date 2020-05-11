package com.leetcode.crackthecodes.solutions.easy;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class P0125_ValidPalindromeTest {

    private P0125_ValidPalindrome classUnderTest = new P0125_ValidPalindrome();

    @ParameterizedTest
    @MethodSource("inputData")
    void testIsValidPalindrome(String input, boolean expected) {
            Assertions.assertEquals(classUnderTest.isPalindrome(input),expected);
    }

    static Stream<Arguments> inputData(){
        return Stream.of(
            Arguments.of("",true),
                Arguments.of("A man, a plan, a canal: Panama",true),
                Arguments.of("race a car", false)
        );
    }
}