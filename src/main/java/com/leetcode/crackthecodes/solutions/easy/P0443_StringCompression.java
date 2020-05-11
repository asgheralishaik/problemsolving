package com.leetcode.crackthecodes.solutions.easy;

/**
 * Given an array of characters, compress it in-place.
 *
 * The length after compression must always be smaller than or equal to the original array.
 *
 * Every element of the array should be a character (not int) of length 1.
 *
 * After you are done modifying the input array in-place, return the new length of the array.
 *
 *
 * Follow up:
 * Could you solve it using only O(1) extra space?
 *
 *
 * Example 1:
 *
 * Input:
 * ["a","a","b","b","c","c","c"]
 *
 * Output:
 * Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 *
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 *
 *
 * Example 2:
 *
 * Input:
 * ["a"]
 *
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 *
 * Explanation:
 * Nothing is replaced.
 *
 *
 * Example 3:
 *
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 *
 * Output:
 * Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 *
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
 * Notice each digit has it's own entry in the array.
 *
 *
 * Note:
 *
 * All characters have an ASCII value in [35, 126].
 * 1 <= len(chars) <= 1000.
 * 
 */

public class P0443_StringCompression {

    public int compress(char[] chars) {
        int totalCount = 0, iterationCount = 1;
        for (int i = 1; i <= chars.length; i++, iterationCount++) {
            if (i < chars.length && chars[i] == chars[i - 1])
                continue;
            chars[totalCount++] = chars[i - 1];
            if (iterationCount != 1) {
                int digitCount = countDigits(iterationCount);
                int initialDigitCount = digitCount;
                for (int j = totalCount + initialDigitCount - 1; j >= totalCount; j--) {
                    int digit = iterationCount % 10;
                    chars[j] = (char) (digit + '0');
                    iterationCount = iterationCount / 10;
                    digitCount--;
                }
                totalCount += initialDigitCount;
            }
            iterationCount = 0;
        }
        return totalCount;
    }

    int countDigits(int number) {
        if (number >= 1_000_000_000) {
            return 10;
        }
        else if (number >= 100_000_000) {
            return 9;
        }
        else if (number >= 10_000_000) {
            return 8;
        }
        else if (number >= 1_000_000) {
            return 7;
        }
        else if (number >= 100_000) {
            return 6;
        }
        else if (number >= 10_000) {
            return 5;
        }
        else if (number >= 1_000) {
            return 4;
        }
        else if (number >= 100) {
            return 3;
        }
        else if (number >= 10) {
            return 2;
        }
        else if (number >= 1) {
            return 1;
        }
        else if (number == 0) {
            return 1;
        }
        return 0;
    }
}
