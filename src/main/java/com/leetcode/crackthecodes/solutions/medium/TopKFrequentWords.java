package com.leetcode.crackthecodes.solutions.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        List<String> finalResult = new ArrayList<>(k);
        for (String eachWord : words) {

            treeMap.put(eachWord, treeMap.getOrDefault(eachWord, 0) + 1);
        }

        //sort by values
        Map<String, Integer> sortedMap = treeMap.entrySet().stream().
                sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        sortedMap.keySet().stream().limit(k).forEach((key) -> {
            finalResult.add(key);
        });

        return finalResult;
    }


//    public List<String> topKFrequent1(String[] words, int k)
//    {
//        PriorityQueue<Map.Entry<String, Integer>> minHeap =
//                new PriorityQueue<>((a,b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());
//        Map<String, Integer> map = new HashMap<>();
//        List<String> list = new LinkedList<>();
//
//        for(String word : words)
//            map.put(word, map.getOrDefault(word, 0) + 1);
//
//        for(Map.Entry<String, Integer> entry: map.entrySet())
//        {
//            minHeap.offer(entry);
//
////            if(minHeap.size() > k)
////                minHeap.poll();
//        }
//
//        while(!minHeap.isEmpty())
//            list.add(0, minHeap.poll().getKey());
//
//        return list;
//    }

    public static void main(String[] args) {
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
        topKFrequentWords.topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2);
    }

}
