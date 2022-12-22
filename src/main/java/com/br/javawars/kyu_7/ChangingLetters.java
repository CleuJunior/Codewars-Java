package com.br.javawars.kyu_7;

public class ChangingLetters {
    public static String swap(String st){
        String[] splitString = st.split("");
        StringBuilder sb = new StringBuilder();

        for (String s : splitString) {
            switch (s) {
                case "a", "e", "i", "o", "u" -> sb.append(s.toUpperCase());
                default -> sb.append(s);
            }
        }
        return sb.toString();
    }

}
