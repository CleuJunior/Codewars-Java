package com.br.javawars.kyu_7;

public class DigitsExplosion {
    public static String explode(String digits) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrayOfNumberString = digits.split("");

        for (String strValue : arrayOfNumberString) {
            stringBuilder
                    .append(String.valueOf(strValue)
                    .repeat(Math.max(0, Integer.parseInt(strValue))));
        }

        return stringBuilder.toString();
    }
}
