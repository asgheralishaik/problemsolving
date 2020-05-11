package com.leetcode.crackthecodes.solutions.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.leetcode.crackthecodes.solutions.easy.P0020_ValidParentheses;

public class P0020_ValidParenthesesTest {

    P0020_ValidParentheses validParentheses;

    @BeforeEach
    public void before() {
        validParentheses = new P0020_ValidParentheses();
    }

    @ParameterizedTest
    @ValueSource(strings = { "(())", "({()})", "([()])", "{[()]}", "", "()[]{}" })
    public void testValidParenthesesForTrue(String parentheses) {
        assertTrue(validParentheses.isValid(parentheses));
    }

    @ParameterizedTest
    @ValueSource(strings = { "({())", "(()))", "([())", "{[(]})", "(])", "(]" })
    public void testValidParenthesesForFalse(String parentheses) {
        assertFalse(validParentheses.isValid(parentheses));
    }
}
