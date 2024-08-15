package com.br.javawars.kyu_7;

import java.util.Arrays;

public class DoubleEveryOther {

    public static int[] doubleEveryOther(int[] a) {
        for (int i = 1; i < a.length; i += 2) {
            a[i] *= 2;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(doubleEveryOther(arr))); // Output: [1, 4, 3, 8]
    }
}
