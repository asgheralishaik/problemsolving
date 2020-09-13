package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CheckForSumTest {


    private CheckForSum checkForSum;

    @BeforeEach
    public void before() {
        checkForSum = new CheckForSum();
    }

    @ParameterizedTest
    @MethodSource("inputData")
    public void testValidParenthesesForTrue(int[] inputArray, int sum, int[] result) {
        assertArrayEquals(checkForSum.checkForSumWithHashMap(inputArray, sum), result);
    }

    static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of(new int[]{5, 8, 14, 11, 10, -1, 1}, 15, new int[]{5, 10}),
                Arguments.of(new int[]{-1, 19, 23,9, 5, 3, 21,34,54}, 32, new int[]{23, 9}),
                Arguments.of(new int[]{0,1,2,3,4,5,6,7,8}, -32, new int[]{0,0})
        );
    }

}