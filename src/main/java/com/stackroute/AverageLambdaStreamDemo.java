package com.stackroute;

import java.util.IntSummaryStatistics;
import java.util.List;

public class AverageLambdaStreamDemo {

    public int average(List<Integer> primes) {
        IntSummaryStatistics stats = primes.stream().mapToInt((i)-> i).summaryStatistics();
        return (int) stats.getAverage();
    }

}
