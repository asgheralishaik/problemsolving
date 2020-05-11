package com.leetcode.crackthecodes.solutions.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P0206_ReverseLInkedListTest {

    private P0206_ReverseLInkedList  p0206_reverseLInkedList = new P0206_ReverseLInkedList();

@ParameterizedTest
@MethodSource({"testCases" })
    void reverseList(ListNode input,ListNode expected) {

        ListNode result = p0206_reverseLInkedList.reverseList(input);
    Assertions.assertEquals(expected,result);
    }

    static Stream<Arguments> testCases() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = null;


        ListNode r1 = new ListNode(5);
        ListNode r2 = new ListNode(4);
        ListNode r3 = new ListNode(3);
        ListNode r4 = new ListNode(2);
        ListNode r5 = new ListNode(1);


        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r4.next = r5;
        r5.next = null;

        return Stream.of(
                Arguments.of(one,r1)
        );



    }
}