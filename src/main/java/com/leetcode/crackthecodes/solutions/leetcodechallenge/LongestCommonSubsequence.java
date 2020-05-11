package com.leetcode.crackthecodes.solutions.leetcodechallenge;

public class LongestCommonSubsequence {

    Integer dp[][];

    public static int LCSM1(char[] X,char []Y,int i,int j){
        if(i<=0|| j<=0){
            return 0;
        }
        if(X[i-1] == Y[j-1]){
            return 1+ LCSM1(X,Y,i-1,j-1);

        }else {
            return Math.max(LCSM1(X,Y,i-1,j),LCSM1(X,Y,i,j-1));
        }
    }

    public static int LCSM2(char[] X,char []Y,int i,int j,Integer[][] dp){
        if(i<=0|| j<=0){
            return 0;
        }
        if(dp[i][j]!=null ){
            return dp[i][j];
        }
        if(X[i-1] == Y[j-1]){
            return 1+ LCSM2(X,Y,i-1,j-1,dp);

        }else {
            return dp[i][j] = Math.max(LCSM2(X,Y,i-1,j,dp),LCSM2(X,Y,i,j-1,dp));
        }
    }

    public static int LCSM3(char[] X,char []Y,int m,int n){
        int[][] memo = new int[m+1][n+1];

        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++){

                if(i==0||j==0){
                    memo[i][j]=0;
                }else if(X[i-1]==Y[j-1]){
                    memo[i][j]= 1+LCSM3(X,Y,i-1,j-1);
                }else {
                    memo[i][j]= Math.max(LCSM3(X,Y,i-1,j),LCSM3(X,Y,i,j-1));
                }
            }
        }
        return memo[m][n];
    }

}
