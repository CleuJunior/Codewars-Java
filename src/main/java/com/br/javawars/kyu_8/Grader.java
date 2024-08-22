package com.br.javawars.kyu_8;

public class Grader {

    public static char grade(double score) {
        return switch (score) {
            case 0.9, 10 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

}
