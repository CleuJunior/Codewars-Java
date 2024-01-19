package com.br.javawars.kyu_8.countbyx;

public class Kata {
    public static int[] countBy(int x, int n){
        // Your code here
       int multiplier = 0;
       int[] multiplierArray = new int[n];

       for(int i = 0; i < n; i++){
            multiplier+=x;
            multiplierArray[i] = multiplier;
       }

       return multiplierArray;
    }
}
