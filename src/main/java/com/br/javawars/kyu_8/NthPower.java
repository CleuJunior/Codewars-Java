package com.br.javawars.kyu_8;

public class NthPower {
    public static int nthPower(int[] array, int n) {
        if (n > array.length - 1) return -1;
        return (int) Math.pow(array[n], n);
    }
}
