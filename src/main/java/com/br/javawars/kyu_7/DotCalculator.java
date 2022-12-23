package com.br.javawars.kyu_7;

public class DotCalculator {

    public static String calc(String txt){
        if(txt.isEmpty())
            return txt;

        if(txt.contains("+"))
            return calculatorPlus(txt);

        if(txt.contains("-"))
            return calculatorMinus(txt);

        if(txt.contains("*"))
            return calculatorTimes(txt);

        return calculatorDivider(txt);
    }

    private static String calculatorPlus(String str) {
        return str.replace("+", "").replaceAll(" ", "");
    }

    private static String calculatorMinus(String str) {
         String[] minusDots = str
                 .replaceAll(" ", "")
                 .split("-");

         int aux = minusDots[0].length() - minusDots[1].length();

        return ".".repeat(Math.max(0, aux));
    }

    private static String calculatorTimes(String str) {
         String[] timesDots = str
                 .replaceAll(" ", "")
                 .split("\\*");

         int aux = timesDots[0].length() * timesDots[1].length();

        return ".".repeat(Math.max(0, aux));
    }

    private static String calculatorDivider(String str) {
         String[] dividerDots = str
                 .replaceAll(" ", "")
                 .split("//");

         int aux = dividerDots[0].length() / dividerDots[1].length();

        return ".".repeat(aux);
    }
}
