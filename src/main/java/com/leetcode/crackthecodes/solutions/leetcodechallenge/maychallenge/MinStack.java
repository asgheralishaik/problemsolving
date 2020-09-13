package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import java.util.Stack;

public class MinStack {
    int arr[] = new int[10000];
    int minarr[] = new int[10000];
    int mainPtr = -1;
    int minPtr = -1;
    public MinStack() {

    }

//    public void push(int x) {
//        if(mainPtr++>10000) return;
//        else{
//            arr[mainPtr++] = x;
//        }
//
//        if(minPtr++>10000) return;
//        if(minarr)
//    }
//
//    public void pop() {
//        stack.pop();
//        minStack.pop();
//    }
//
//    public int top() {
//        return stack.peek();
//    }
//
//    public int getMin() {
//        return minStack.peek();
//    }
}
