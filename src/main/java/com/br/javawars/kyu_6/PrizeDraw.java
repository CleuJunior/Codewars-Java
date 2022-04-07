package com.br.javawars.kyu_6;

import java.util.*;

public class PrizeDraw {

    private final String NAME;
    private final int SOM;

    private PrizeDraw(String name, int weight){
        this.NAME = name;
        this.SOM = calcLetterValue()*weight;
    }

    private int calcLetterValue(){
        int value=0;
        for (int i = 0; i< NAME.length(); i++){
            value+= NAME.toLowerCase().charAt(i)-96;
        }
        return value+ NAME.length();
    }

    public static String nthRank(String st, Integer[] we, int n) {

        String[] names = st.split(",");

        if (st.equals("")) return "No participants";
        if (names.length<n) return "Not enough participants";

        List<PrizeDraw> sortedNames = new ArrayList<>();
        for (int i=0; i<names.length; i++){
            sortedNames.add(new PrizeDraw(names[i],we[i]));
        }

        sortedNames.sort((o1, o2) -> {
            if (o1.SOM ==o2.SOM) return o1.NAME.compareTo(o2.NAME);
            else return o2.SOM - o1.SOM;
        });

        return sortedNames.get(n-1).NAME;
    }
}
