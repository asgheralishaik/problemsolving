package com.leetcode.crackthecodes.solutions.honeypot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreePalindromicPartitions1 {

    public static List<String> allPalindromeSubstring(String word)
    {
        List<String> list = new ArrayList<String>();

        // moving the pivot from starting till end of the string
        for (float pivot = 0; pivot < word.length(); pivot += .5) {

            // set radius to the first nearest element
            // on left and right
            float palindromeRadius = pivot - (int)pivot;

            // if the position needs to be compared has an element
            // and the characters at left and right matches
            while ((pivot + palindromeRadius) < word.length()
                    && (pivot - palindromeRadius) >= 0
                    && word.charAt((int)(pivot - palindromeRadius))
                    == word.charAt((int)(pivot + palindromeRadius))) {

                list.add(word.substring((int)(pivot - palindromeRadius),
                        (int)(pivot + palindromeRadius + 1)));

                // increasing the radius by 1 to point to the
                // next elements in left and right
                palindromeRadius++;
            }
        }

        if(list.isEmpty()){
            list.add("Impossible");
        }
        else if(list.size()>3) {

            list.removeIf(p->p.length()==1);
    }
        return list;
    }

    public static void main(String[] args) {

        ThreePalindromicPartitions1.allPalindromeSubstring("kayak");
    }

}
