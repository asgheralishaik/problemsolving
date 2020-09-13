package com.leetcode.crackthecodes.solutions.leetcodechallenge.junechallenge;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

public class DeleteNode {

    public void deleteNode(ListNode node) {
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
    }


    public static void main(String[] args) {
        DeleteNode deleteNode = new DeleteNode();
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        deleteNode.deleteNode(l1);
    }
}
