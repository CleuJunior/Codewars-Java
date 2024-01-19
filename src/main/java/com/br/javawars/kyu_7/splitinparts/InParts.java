package com.br.javawars.kyu_7.splitinparts;

public class InParts {

    public static String splitInParts(String s, int partLength) {
        StringBuilder builder = new StringBuilder();
        int partLengthCount = 0;

        for(char c : s.toCharArray()) {
            if(partLengthCount == partLength) {
                builder.append(" ");
                partLengthCount = 0;
            }

            builder.append(c);
            partLengthCount++;
        }

        return builder.toString();
    }

}
