package com.br.javawars.kyu_8;

public class Calculate {

    private static double total(double weight, double height) { return weight / (Math.pow(height, 2));}
    public static String bmi(double weight, double height) {

        double totalBMI = total(weight, height);

        if (totalBMI <= 18.5) return "Underweight";
        if (totalBMI <= 25.0) return "Normal";
        if (totalBMI <= 30)   return "Overweight";

        return "Obese";
    }

}
