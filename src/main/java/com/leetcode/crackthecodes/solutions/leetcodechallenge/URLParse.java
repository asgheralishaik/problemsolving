package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class URLParse {

    public static Map<String, List<String>> splitQuery(String query) {
        Map<String, List<String>> query_pairs = new LinkedHashMap<String, List<String>>();
        String parsedStr = query.substring(query.indexOf("?") + 1);
        String[] pairs = parsedStr.split("&");

        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            if (!query_pairs.containsKey(pair.substring(0, idx))) {
                query_pairs.put(pair.substring(0, idx), new LinkedList<>());
            }
                query_pairs.get(pair.substring(0, idx)).add(pair.substring(idx + 1));
        }
        return query_pairs;
    }

    public static void main(String[] args) {

        URLParse.splitQuery("http://my.test.com/test?param1=ab&param2=cd&param2=ef");
    }
}
