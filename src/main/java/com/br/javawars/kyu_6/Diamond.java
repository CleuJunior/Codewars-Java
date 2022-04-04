package com.br.javawars.kyu_6;

public class Diamond {
    public static String print(int n) {
        if(n % 2 == 0 || n < 0) return null;
        if(n == 1) return "*\n";

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i+=2) {
            stringBuilder.append(" ".repeat((n - i) / 2)).append("*".repeat(i)).append("\n");
        }

        for (int i = n-2; i > 0; i-=2) {
            stringBuilder.append(" ".repeat((n - i) / 2)).append("*".repeat(i)).append("\n");
        }

        return stringBuilder.toString();
    }
}
