package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.*;
import java.util.stream.Collectors;

public class UncommonWords {
    public String[] uncommonFromSentences(String A, String B) {

        int length = A.length() > B.length() ? A.length() : B.length();
        List<String> result = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();

        String[] arr = A.split(" ");
        for (String e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        String[] arr1 = B.split(" ");
        for (String e : arr1) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        result = map.entrySet().stream().filter(e -> e.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());

        String[] res = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return  res;
    }
}
