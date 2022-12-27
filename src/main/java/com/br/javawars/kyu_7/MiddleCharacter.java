package com.br.javawars.kyu_7;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        if (word.length() == 0 || word.length() == 1)
            return word;

        int mid = word.length() / 2;

        if(word.length() % 2 != 0)
            return word.substring(mid, mid+1);

        return word.substring(mid-1, mid+1);
    }
}
