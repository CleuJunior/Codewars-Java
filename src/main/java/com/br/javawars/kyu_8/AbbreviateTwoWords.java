package com.br.javawars.kyu_8;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String newName = name.charAt(0) + ".";
        for (int i = 0; i < name.length() - 1; i++) {
            if (name.charAt(i) == ' ') newName += name.charAt(i + 1);

        }
        return newName.toUpperCase();
    }
}
