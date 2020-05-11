package com.leetcode.crackthecodes.solutions.easy;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
 * valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Example 1:
 *
 * Input: "()"
 * Output: true
 * Example 2:
 *
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: "(]"
 * Output: false
 * Example 4:
 *
 * Input: "([)]"
 * Output: false
 * Example 5:
 *
 * Input: "{[]}"
 * Output: true
 *
 * (--40,{ ---123,[---91
 * )--41
 */

public class P0020_ValidParentheses {
    public boolean isValid(String s) {
        char[] validator = new char[s.length()];
        char[] mapping = new char[] { '(', '[', '{' };
        int head = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                validator[head++] = c;
            }
            else if (head - 1 < 0) {
                return false;
            }
            else if (validator[head - 1] == mapping[(c / 40) - 1]) {
                head--;
            }
            else {
                return false;
            }
        }
        return head == 0;
    }

}