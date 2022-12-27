package com.br.javawars.kyu_7;

public class LastSurvivor {

    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);

        for (int i : coords)
            sb.deleteCharAt(i);

        return sb.toString();
    }
}
