package com.br.javawars.kyu_6;

import java.util.Arrays;
public class Order {
    public static String order(String words) {
        if (words.isEmpty()) return "";

        String[] strings = words.split(" ");
        Arrays.sort(strings, (s1, s2) -> Integer.compare(getNumber(s1), getNumber(s2)));
        return String.join(" ", strings);
    }

    private static int getNumber(String s) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = -1;
        for (int n : numbers) {
            if (s.contains(String.valueOf(n))) {
                result = n;
                break;
            }
        }
        return result;
    }
}
