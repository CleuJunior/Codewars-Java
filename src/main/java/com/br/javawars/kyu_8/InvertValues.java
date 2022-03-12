package com.br.javawars.kyu_8;

public class InvertValues {
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) { array[i] *= (-1); }

        return array;

    }
}
