package com.leetcode.crackthecodes.solutions.easy;

public class StringPermutations {

    public void permutations(String str) {

        permutations(str,"");
    }
    void permutations(String str,String prefix) {

        if(str.length() == 0){
            System.out.print(prefix);
            System.out.println(" ");
        }else {
            for(int i=0;i<str.length();i++) {
                String rem = str.substring(0,i) + str.substring(i+1);
                permutations(rem,prefix+str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {

        StringPermutations stringPermutations=new StringPermutations();
        stringPermutations.permutations("abc");
    }
}
