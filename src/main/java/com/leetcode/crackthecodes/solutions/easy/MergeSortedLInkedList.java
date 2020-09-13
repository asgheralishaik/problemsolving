package com.leetcode.crackthecodes.solutions.easy;

public class MergeSortedLInkedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(-1);
        ListNode ptr = result;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ptr.next = l1;
                ptr = ptr.next;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                ptr = ptr.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            ptr.next = l1;
        } else {
            ptr.next = l2;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);

        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;


        ListNode one1 = new ListNode(1);
        ListNode two1 = new ListNode(2);
        ListNode three1 = new ListNode(3);
        ListNode four1 = new ListNode(4);

        one1.next = two1;
        two1.next = three1;
        three1.next = four1;

        MergeSortedLInkedList m = new MergeSortedLInkedList();
        m.mergeTwoLists(one, one1);

    }

}
