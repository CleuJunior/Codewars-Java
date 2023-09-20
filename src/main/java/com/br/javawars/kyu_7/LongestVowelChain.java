package com.br.javawars.kyu_7;

import java.util.regex.Pattern;

public class LongestVowelChain {

    public static int solve(String s){
        int count = 0;
        int aux = 0;

        for (int i = 0; i < s.length(); i++) {

            if (vowel(String.valueOf(s.charAt(i)))) {
                aux++;
                count = Math.max(count, aux);

            } else {
                aux = 0;
            }
        }

       return count;
    }

    private static boolean vowel(String input) {
        String regex = "[aeiouAEIOU]";
        return Pattern.matches(regex, input);
    }
}
