package com.leetcode.crackthecodes.solutions.easy;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class P0206_ReverseLInkedList {
    ListNode temp = null;

    ListNode t1 = null;

    public ListNode reverseList(ListNode head) {
        t1 = head;
        while (head != null) {
            t1 = head.next;
            head.next = temp;
            temp = head;
            head = t1;
        }
        return temp;
    }
}
