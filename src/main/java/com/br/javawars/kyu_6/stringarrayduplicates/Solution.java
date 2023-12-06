package com.br.javawars.kyu_6.stringarrayduplicates;


public class Solution {
    public static String[] dup(String[] arr){
        String[] notDupArray = new String[arr.length];

        int index = 0;
        for (String word: arr) {
            StringBuilder stringBuilder = new StringBuilder();
            char prevChar = '\0';

            for (char currentChar : word.toCharArray()) {
                if (currentChar != prevChar) {
                    stringBuilder.append(currentChar);
                    prevChar = currentChar;
                }
            }

            notDupArray[index] = stringBuilder.toString();
            index++;
        }

        return notDupArray;
    }
}
