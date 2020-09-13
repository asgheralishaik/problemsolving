package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph=paragraph.replaceAll("[^a-zA-Z]"," ").toLowerCase();
        String[] arr = paragraph.split(" ");

        List<String> bannedWords = new ArrayList<>();
        Stream.of(banned).forEach(e -> {
            bannedWords.add(e);
        });

        Map<String, Integer> map = new HashMap<>();
        for (String e : arr) {

            map.put(e, map.getOrDefault(e, 0) + 1);

        }
        LinkedHashMap<String, Integer> li = map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).
                filter(p -> !bannedWords.contains(p.getKey())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return li.keySet().stream().findFirst().get();
    }

    public static void main(String[] args) {
        MostCommonWord mostCommonWord = new MostCommonWord();
        mostCommonWord.mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"});
    }
}
