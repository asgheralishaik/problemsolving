package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElementStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> minStack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();
        maxStack.push(Integer.MIN_VALUE);
        for(int i=0;i<N;i++){
            int op = sc.nextInt();
            switch(op){

                case 1:
                    int itemToPush = sc.nextInt();
                    minStack.push(itemToPush);
                    int maxSoFar = maxStack.peek();
                    if(itemToPush>maxSoFar){
                        maxStack.push(itemToPush);
                    }else {
                        maxStack.push(maxSoFar);
                    }
                    break;

                case 2:
                    minStack.pop();
                    maxStack.pop();
                    break;

                case 3:
                    System.out.println(maxStack.peek());
                    break;

            }
        }
    }
}
