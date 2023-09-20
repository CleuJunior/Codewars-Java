package com.br.javawars.kyu_7;

import java.util.regex.Pattern;

public class IdentifierChecker {
    public static boolean isValid(String idn) {
        if (idn.isEmpty()) {
            return false;
        }

        String regex = "^[a-zA-Z_$][a-zA-Z\\d_$]*$";

        return Pattern.matches(regex, idn);
    }
}
