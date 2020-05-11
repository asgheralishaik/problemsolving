package com.leetcode.crackthecodes.solutions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P0013_RomanToIntTest {

    private P0013_RomanToInt p0013_romanToInt = new P0013_RomanToInt();
    @ParameterizedTest
    @MethodSource({"testCases" })
    void romanToInt(String s,int expected) {

        int result = p0013_romanToInt.romanToInt(s);
        Assertions.assertEquals(result,expected);

    }


    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("III",3),
                Arguments.of("IV",4),
                Arguments.of("IX",9),
               Arguments.of("LVIII",58),
                Arguments.of("MCMXCIV",1994)


        );
    }

}