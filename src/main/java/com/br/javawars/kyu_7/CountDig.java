package com.br.javawars.kyu_7;

public class CountDig {

    public static int nbDig(int n, int d) {
        StringBuilder countNumbers  = new StringBuilder();
        int countAux = 0;

        for (int i = 0; i <= n ; i++) { countNumbers.append(i * i); }

        String[] splitStringNum = countNumbers.toString().split("");

        for (int i = 0; i < countNumbers.length(); i++) { if (Integer.parseInt(splitStringNum[i]) == d) countAux++; }

        return countAux;
    }
}
