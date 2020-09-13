package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharsByFreqquency {

    public String frequencySort(String s) {

        StringBuilder stringBuilder = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));

        maxHeap.addAll(map.keySet());

        map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        stringBuilder.append(e.getKey());
                    }
                });

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SortCharsByFreqquency sortCharsByFreqquency = new SortCharsByFreqquency();
        sortCharsByFreqquency.frequencySort("zzpppppgggweeeeyyyyyaaaaaaaaaaaaaaa");
    }

}
