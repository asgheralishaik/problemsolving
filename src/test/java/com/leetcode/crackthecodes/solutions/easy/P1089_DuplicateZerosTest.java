package com.leetcode.crackthecodes.solutions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class P1089_DuplicateZerosTest {

    private P1089_DuplicateZeros classUnderTest = new P1089_DuplicateZeros();

    @ParameterizedTest
    @MethodSource("input")
    void baseTestCase(int[] input, int[] output) {
        classUnderTest.duplicateZeros(input);
        Assertions.assertArrayEquals(input,output);
    }

    public static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[] {1,0,2,3,0,4,5,0} , new int[] {1,0,0,2,3,0,0,4}),
                Arguments.of(new int[] {1,2,3}, new int[] {1,2,3}),
                Arguments.of(new int[] {1,0,0,2,3,0,4,5,0} , new int[] {1,0,0,0,0,2,3,0,0})
        );
    }
}