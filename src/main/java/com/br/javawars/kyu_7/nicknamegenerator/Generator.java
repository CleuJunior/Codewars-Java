package com.br.javawars.kyu_7.nicknamegenerator;

public class Generator {
    public static String nickname (String name) {
        if (name.length() < 4)
            return "Error: Name too short";

        StringBuilder sb = new StringBuilder(name.substring(0, 3));

        if (hasVowelAtIndexThree(name))
            sb.append(name.charAt(3));

        return sb.toString();
    }

    private static boolean hasVowelAtIndexThree(String name) {
        for (Character cs: "aeiou".toCharArray()) {
            if(name.charAt(2) == cs) return true;
        }

        return false;
    }
}
