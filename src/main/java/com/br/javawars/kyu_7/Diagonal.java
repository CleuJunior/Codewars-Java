package com.br.javawars.kyu_7;

public class Diagonal {

    public static int diagonalSum(final int[][] matrix) {
        int sumMatrix = 0;
        for (int i = 0; i < matrix.length; i++) { sumMatrix += matrix[i][i];  }
        return sumMatrix;
    }
}

