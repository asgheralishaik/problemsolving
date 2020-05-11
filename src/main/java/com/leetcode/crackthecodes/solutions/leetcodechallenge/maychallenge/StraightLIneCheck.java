package com.leetcode.crackthecodes.solutions.leetcodechallenge.maychallenge;

public class StraightLIneCheck {

    public boolean checkStraightLine(int[][] coordinates) {

        int xDiff=  coordinates[1][0] - coordinates[0][0];
        int yDiff = coordinates[1][1] - coordinates[0][1];

        for(int i=2;i<coordinates.length;i++){
            int currXDIff = coordinates[i][0] - coordinates[i-1][0];
            int currYDIff = coordinates[i][1] - coordinates[i-1][1];

            if(xDiff *currYDIff !=yDiff*currXDIff){
                return false;
            }
        }
        return true;
    }

}
