package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.*;

public class GroupedAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put (sorted, new ArrayList<>());
            }
                map.get(sorted).add(str);

        }

        finalList.addAll(map.values());
        return finalList;
    }

    public static void main(String[] args) {
        GroupedAnagrams groupedAnagrams = new GroupedAnagrams();
        groupedAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

    }
}
