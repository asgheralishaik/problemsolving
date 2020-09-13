package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {


        int[] arr = new int[26];

        for (char c : s.toCharArray()) {

            int index = Math.abs(c - 97);
            arr[index]++;

        }

        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i)-97 ==1){
                return i;
            }

            return -1;

        }

//        int index = -1;
//        if(s.length() ==0){
//            return index;
//        }
//        Map<Character,Integer> map = new LinkedHashMap<>();
//        for(char c : s.toCharArray()){
//            map.put(c,map.getOrDefault(c,0)+1);
//        }
//           Optional<Map.Entry<Character,Integer>> c  = map.entrySet().stream().filter(p->p.getValue()==1).findFirst();
//
//        if(c.isPresent()){
//            return s.indexOf(c.get().getKey());
//        }else {
//            return -1;
//        }

        return 0;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        System.out.println(firstUniqueCharacter.firstUniqChar("chhbbcz"));
    }
}
