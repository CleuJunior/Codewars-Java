package com.br.javawars.kyu_7;

public class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length < 1 || a2.length < 1) return -1;

        int total = 0;

        for (String strainA1 : a1) {
            for (String strainA2 : a2) {

                total = Math.max(total, Math.abs(strainA1.length() - strainA2.length()));
            }
        }


        return total;
    }
}
