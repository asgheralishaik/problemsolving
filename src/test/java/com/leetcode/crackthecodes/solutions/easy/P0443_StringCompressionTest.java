package com.leetcode.crackthecodes.solutions.easy;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class P0443_StringCompressionTest {

    private P0443_StringCompression stringCompression;

    @BeforeEach
    public void before() {
        stringCompression = new P0443_StringCompression();
    }

    @ParameterizedTest
//    @MethodSource({ "testCases", "hugeTestCase" })
    @MethodSource({ "testCases" })
    public void testCompression(char[] input, int expected, char[] inputExpectedAfter) {
        Assertions.assertEquals(expected, stringCompression.compress(input));
        Assertions.assertArrayEquals(inputExpectedAfter, input);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("aabbccc".toCharArray(), 6, "a2b2c3c".toCharArray()),
                Arguments.of("aabbbbbbbbbbcccccccccc".toCharArray(), 8, "a2b10c10bbbbcccccccccc".toCharArray()),
                Arguments.of("a".toCharArray(), 1, "a".toCharArray()),
                Arguments.of("aaabbaa".toCharArray(), 6, "a3b2a2a".toCharArray()),
                Arguments.of("abc".toCharArray(), 3, "abc".toCharArray()),
                Arguments.of("abbc".toCharArray(), 4, "ab2c".toCharArray()),
                Arguments.of("abcc".toCharArray(), 4, "abc2".toCharArray()),
                Arguments.of("abcc".toCharArray(), 4, "abc2".toCharArray()),
                Arguments.of("abbbbbbbbbbbb".toCharArray(), 4, "ab12bbbbbbbbb".toCharArray()),
                Arguments.of("aaaaab".toCharArray(), 3, "a5baab".toCharArray()));
    }

    static Stream<Arguments> hugeTestCase() {
        char[] bigArray = new char[1000000];
        Arrays.fill(bigArray, 'a');
        char[] copyOfBigArray = Arrays.copyOf(bigArray, bigArray.length);
        copyOfBigArray[1] = '1';
        copyOfBigArray[2] = '0';
        copyOfBigArray[3] = '0';
        copyOfBigArray[4] = '0';
        copyOfBigArray[5] = '0';
        copyOfBigArray[6] = '0';
        copyOfBigArray[7] = '0';
        return Stream.of(Arguments.of(bigArray, 8, copyOfBigArray));
    }

}
