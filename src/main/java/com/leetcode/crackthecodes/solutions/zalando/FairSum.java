package com.leetcode.crackthecodes.solutions.zalando;

public class FairSum {
    public int solution(int[] A, int[] B) {

        int N = A.length;
        int fairCountIndexCount = 0;
        for (int i = 1; i < N; i++) {

            if(isFair(i,A,B,N)) {
                fairCountIndexCount+=1;
            }
        }
        return fairCountIndexCount;

    }


    private boolean isFair(int k, int[] A, int[] B, int N) {

        int sumFirstArrayFirstHalf = 0;
        for (int i = 0; i <= k - 1; i++) {
            sumFirstArrayFirstHalf += A[i];
        }

        int sumFirstArraySecondHalf = 0;

        for (int i = k; i < N; i++) {
            sumFirstArraySecondHalf += A[i];
        }

        if (sumFirstArrayFirstHalf == sumFirstArraySecondHalf) {

            int sumSecondArrayFirstHalf = 0;
            for (int i = 0; i <= k - 1; i++) {
                sumSecondArrayFirstHalf += B[i];
            }

            if(sumSecondArrayFirstHalf!=sumFirstArrayFirstHalf) {
                return false;
            }
            int sumSecondArraySecondHalf = 0;

            for (int i = k; i < N; i++) {
                sumSecondArraySecondHalf += B[i];
            }
            if(sumSecondArraySecondHalf!=sumFirstArraySecondHalf) {
                return false;
            }

            return true;


        }

        return false;
    }

    public static void main(String[] args) {
        FairSum f = new FairSum();
        f.solution(new int[]{4, -1, 0, 3},new int[]{-2, 5, 0, 3});
    }
}
