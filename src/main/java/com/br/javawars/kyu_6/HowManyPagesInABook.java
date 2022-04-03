package com.br.javawars.kyu_6;

public class HowManyPagesInABook {
    public static int amountOfPages(int summary) {
        if(summary < 10) return summary;

        StringBuilder strBuilder = new StringBuilder();
        int value = -2;

        for (int i = 1; i <= summary; i++) {
            if(strBuilder.length() > summary) {
                value += i;
                break;
            }

            strBuilder.append(i);
        }

        return value;
    }
}