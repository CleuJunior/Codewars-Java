package com.br.javawars.kyu_8;

public class GrassHopper {
    public static int findAverage(int[] nums) {

        int sumTotal = 0;

        for (int sumArr: nums) { sumTotal += sumArr; }

//        for (int i = 0; i < nums.length; i++) {
//            sumTotal += nums[i];
//
//        }

        return sumTotal / nums.length;
    }
}
