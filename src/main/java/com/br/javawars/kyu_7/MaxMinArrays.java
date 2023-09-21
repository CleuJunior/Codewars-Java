package com.br.javawars.kyu_7;

import java.util.Arrays;

public class MaxMinArrays {
    public static int[] solve (int[] arr){
        Arrays.sort(arr);
        int[] rearrangeArray = new int[arr.length];
        int minIdx = 0;
        int maxIdx = arr.length -1;
        boolean alternate = true;

        int index = 0;

        while (minIdx <= maxIdx) {
            if (alternate) {
                rearrangeArray[index] = arr[maxIdx];
                maxIdx -= 1;

            } else {
                rearrangeArray[index] = arr[minIdx];
                minIdx += 1;
            }

            alternate = !alternate;
            index++;
        }

        return rearrangeArray;
    }
}
