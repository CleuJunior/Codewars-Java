package com.br.javawars.kyu_7.sumofcubes;

import java.util.stream.LongStream;

public class Solution {

    public static long sumCubes(long n) {
        return LongStream.rangeClosed(1, n)
                .map(Solution::toCube)
                .sum();
    }

    private static long toCube(long n) {
        return (long) Math.pow(n, 3);
    }
}
