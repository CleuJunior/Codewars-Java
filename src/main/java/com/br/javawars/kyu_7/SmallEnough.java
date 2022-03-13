package com.br.javawars.kyu_7;

import java.util.Arrays;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        Arrays.sort(a);
        return a[a.length - 1] <= limit;

    }

}
