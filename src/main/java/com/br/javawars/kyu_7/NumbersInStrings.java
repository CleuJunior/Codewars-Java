package com.br.javawars.kyu_7;

import java.util.regex.Pattern;

public class NumbersInStrings {
    public static int solve(String s){
        String regex = "\\d+";
        StringBuilder valueInString = new StringBuilder();
        int maxValue = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean isNumber = Pattern.matches(regex, s.substring(i, i+1));

            if (isNumber) {
                valueInString.append(s.charAt(i));
                int aux = Integer.parseInt(valueInString.toString());
                maxValue = Math.max(maxValue, aux);

            } else {
                valueInString = new StringBuilder();
            }
        }
        return maxValue;
    }
}
