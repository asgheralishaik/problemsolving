package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.List;
import java.util.Stack;

public class BackSpaceStrignCompare {

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> sStack = new Stack<Character>();
        for (char c : S.toCharArray()) {
            if (c != '#') {
                sStack.push(c);
            } else if (!sStack.isEmpty()) {
                sStack.pop();
            }
        }
        Stack<Character> tStack = new Stack<Character>();
        for (char c : T.toCharArray()) {
            if (c != '#') {
                tStack.push(c);
            } else if (!tStack.isEmpty()) {
                tStack.pop();
            }
        }

        while (!sStack.isEmpty()) {
            char currentChar = sStack.pop();
            if (!tStack.isEmpty() && tStack.pop() != currentChar) {
                return false;
            }
        }

        return sStack.isEmpty() && tStack.isEmpty();
    }


    public static void main(String[] args) {

    }
}
