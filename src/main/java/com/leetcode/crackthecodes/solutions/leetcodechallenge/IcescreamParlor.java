package com.leetcode.crackthecodes.solutions.leetcodechallenge;

import java.util.HashMap;
import java.util.Map;

public class IcescreamParlor {

    static int[] iceCreamParlor(int[] arr,int m){
        int result[]  = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            int x= arr[i];
            int y = m -x;
            if(map.get(y)!=null){
                result[0]=map.get(y) +1;
                result[1]=i +1;
                break;

            }else {
                map.put(x,i);
            }
        }
        return result;
    }
}
