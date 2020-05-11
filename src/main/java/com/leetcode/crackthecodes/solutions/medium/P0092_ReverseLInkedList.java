package com.leetcode.crackthecodes.solutions.medium;

public class P0092_ReverseLInkedList {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode current = head;
        ListNode pre = null;

        ListNode reversed = null;
        ListNode oldTail = null;
        ListNode next = null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int count = 0;

        while (current != null) {
            count++;

            if (count == m) {
                if(count!=1)
                oldTail = current;
                while (count <= n) {
                    next = current.next;
                    current.next = reversed;
                    reversed = current;
                    current = next;
                    count++;
                }
                if(pre==null) {
                    pre=  reversed;
                }else {
                    pre.next = reversed;
                }if(oldTail!=null){
                    oldTail.next = current;
                }else{
                    oldTail = head;
                    oldTail.next=current;
                }
                if(m ==1) return pre;
            } else {
                pre = current;
                current = current.next;
            }
        }
        return dummy.next;
    }
}
