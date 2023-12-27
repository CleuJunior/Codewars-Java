package com.br.javawars.kyu_7.functionaladdition;

import java.util.function.IntUnaryOperator;

public class Solution {

    public static IntUnaryOperator add(int n) {
        return x -> n + x;
    }

}
