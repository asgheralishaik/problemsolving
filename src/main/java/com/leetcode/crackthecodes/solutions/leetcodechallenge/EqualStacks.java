package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.Stack;

public class EqualStacks {

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        int st1TotalHeight = 0;
        int st2TotalHeight = 0;
        int st3TotalHeight = 0;

        for (int i = h1.length - 1; i >= 0; i--) {
            st1TotalHeight += h1[i];
            st1.push(st1TotalHeight);
        }

        for (int i = h2.length - 1; i >= 0; i--) {
            st2TotalHeight += h2[i];
            st2.push(st2TotalHeight);
        }

        for (int i = h2.length - 1; i >= 0; i--) {
            st3TotalHeight += h3[i];
            st3.push(st3TotalHeight);
        }

        while (true) {

            if (st1.empty() || st2.empty() || st3.empty()) {
                return 0;
            }
            if (st1TotalHeight == st2TotalHeight && st2TotalHeight == st3TotalHeight) {
                return st1TotalHeight;
            }
            if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight) {
                st1.pop();
            }
            if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight) {
                st1.pop();
            }
            if (st1TotalHeight >= st2TotalHeight && st1TotalHeight >= st3TotalHeight) {
                st1.pop();
            }
        }
    }
}
