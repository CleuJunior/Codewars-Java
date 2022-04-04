package com.br.javawars.kyu_6;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target)
    {
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 1+i; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) return new int[]{i, j};
            }
        }

        return new int[]{};
    }
}
