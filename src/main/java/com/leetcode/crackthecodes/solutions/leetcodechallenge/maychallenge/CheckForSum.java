package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import java.util.HashMap;
import java.util.Map;

public class CheckForSum {

    public int[] checkForSum(int[] inputArray, int sum) {

        int[] result = new int[2];

        for (int i = 0; i < inputArray.length - 1; i++) {

            int firstVal = inputArray[i];

            int valueToCheck = sum - firstVal;

            for (int j = i + 1; j < inputArray.length; j++) {

                if (valueToCheck == inputArray[j]) {

                    //found the combination;
                    result[0] = firstVal;
                    result[1] = valueToCheck;

                    return result;
                }
            }

        }
        return result;
    }


    public int[] checkForSumWithHashMap(int[] inputArray, int sum) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : inputArray) {

            int valueToCheck = sum - i;

            if (map.containsKey(valueToCheck)) {

                result[0] = valueToCheck;
                result[1] = i;
                return result;
            } else {
                //only the key matters to me.
                map.put(i, i);
            }
        }
        return result;
    }


}
