package com.leetcode.crackthecodes.solutions.easy;

public class P0013_RomanToInt {

    public int romanToInt(String s) {

        char[] characters = s.toCharArray();

        int i = 0;
        int finalResult = 0;

        while (i <= s.length() - 1 ) {
            if (characters[i] == 'I') {
                if (i+1<=s.length()-1 && characters[i+1] == 'V') {
                    i += 2;
                    finalResult += 4;
                } else if ( i+1<=s.length()-1 &&  characters[i+1] == 'X') {
                    i += 2;
                    finalResult += 9;
                } else {
                    i++;
                    finalResult += 1;
                }
            } else if (characters[i] == 'V') {

                finalResult+= 5;
                i++;

            } else if (characters[i] == 'X') {
                if (i+1<=s.length()-1&& characters[i+1] == 'L') {
                    finalResult+= 40;
                    i+=2;
                } else if (i+1<=s.length()-1 && characters[i+1] == 'C') {
                    finalResult+= 90;
                    i+=2;
                } else {
                    finalResult+= 10;
                    i++;
                }
            } else if (characters[i] == 'L') {
                finalResult+= 50;
                i++;
            } else if (characters[i] == 'C') {
                if (i+1<=s.length()-1 && characters[i+1] == 'D') {
                    finalResult+= 400;
                    i+=2;
                } else if (i+1<=s.length()-1&& characters[i+1] == 'M') {
                    finalResult+= 900;
                    i+=2;
                } else {
                    finalResult+= 100;
                    i++;
                }
            } else if (characters[i] == 'D') {
                finalResult+= 500;
                i++;
            } else if (characters[i] == 'M') {

                finalResult+= 1000;
                i++;

            }

        }
        return finalResult;
    }

}
