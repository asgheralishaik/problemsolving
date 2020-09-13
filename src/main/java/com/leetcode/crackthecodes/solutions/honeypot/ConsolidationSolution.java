package com.leetcode.crackthecodes.solutions.honeypot;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ConsolidationSolution {

    public static int minPartitions(List<Integer> used, List<Integer> totalCapacity) {

        int minPartition = 0;

        List<Integer> sortedTotal = totalCapacity.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int totalNumber = 0;
        for (int i : used) {
            totalNumber += i;
        }

        int counterTotal = 0;
        int currTotal;
        while (totalNumber > 0) {
            currTotal = sortedTotal.get(counterTotal);
            totalNumber = totalNumber - currTotal;

            if (totalNumber > 0) { //e.q +5 when 10-5 , used = 10, total = 5
                minPartition++;
                counterTotal++;
                continue;
            }

            //e.q if used = 5, total = 5
            //e.q if used = 1, total = 5 (last item)
            minPartition++;
        }

return minPartition;
    }
}
