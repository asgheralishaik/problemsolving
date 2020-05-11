package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripleSum {

    static long triplets(int[] a, int[] b, int[] c) {
        int[] distinctA = removeDuplicates(a);
        int[] distinctB = removeDuplicates(b);
        int[] distinctC = removeDuplicates(c);

        long distinctTripltes = 0;
        Arrays.sort(distinctA);
        Arrays.sort(distinctB);
        Arrays.sort(distinctC);

        for (int d : distinctB) {
            long a1 = binarySearch(distinctA, d) + 1;
            long a2 = binarySearch(distinctC, d) + 1;

            distinctTripltes += (a1 * a2);
        }
        return distinctTripltes;
    }

    static int[] removeDuplicates(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        int count = 0;
        int[] res = new int[set.size()];
        for (Integer i : set) {
            res[count++] = i;
        }
        return res;
    }

    static int binarySearch(int[] array, int key) {

        int low = 0;
        int high = array.length - 1;
        int count = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;

            } else {
                low = mid + 1;
                count = mid;
            }
        }
        return count;
    }


}
