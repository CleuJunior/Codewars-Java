package com.br.javawars.kyu_7;

public class Square {
    public static boolean isSquare(int n) {
        int raizQuad = (int) Math.sqrt(n);
        int pow = (int) Math.pow(raizQuad, 2);

        return (pow == n);
    }
}
