package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.Stack;

public class SortStack {
	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()) {
			int tmp = s.pop(); //step 1
			while(!r.isEmpty() && r.peek() > tmp) { //step 2
				s.push(r.pop());
			}
			r.push(tmp); //step 3
		}
		return r;
	}

	public static void main(String[] args) {
		SortStack sortStack = new SortStack();
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		sort(stack);
		System.out.println(stack);
	}
}