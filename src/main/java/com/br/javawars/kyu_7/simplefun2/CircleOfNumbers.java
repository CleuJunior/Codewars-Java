package com.br.javawars.kyu_7.simplefun2;

public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
        int output = firstNumber + n / 2;

        if (output >= n) {
            output -= n;
        }

        return output;
    }
}
