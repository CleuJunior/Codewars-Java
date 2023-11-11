package com.br.javawars.kyu_7.alphabeticalsequence;

import java.util.Arrays;

public class Solution {

    public static String alphaSeq(String s) {
        StringBuilder result = new StringBuilder();

        char[] chars = s.toLowerCase().toCharArray();
        Arrays.sort(chars);

        for (char c : chars) {
            int position = c - 'a' + 1;
            StringBuilder sequence = new StringBuilder();

            for (int i = 0; i < position; i++) {
                if (i == 0) {
                    sequence.append(Character.toUpperCase(c));
                } else {
                    sequence.append(Character.toLowerCase(c));
                }
            }

            result.append(sequence).append(",");
        }

        return result.substring(0, result.length() - 1);
    }

}
