package com.br.javawars.kyu_7.matchmyhusband;

import java.util.Arrays;

public class Solution {

    public static String match(int[] usefulness, int months) {
        int totalUsefulness = Arrays.stream(usefulness).sum();
        double finalSatisfaction = 100 * Math.exp(-0.15 * months);

        return totalUsefulness >= finalSatisfaction ? "Match!" : "No match!";
    }
}
