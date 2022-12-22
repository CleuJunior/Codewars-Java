package com.br.javawars.kyu_7;

public class Spooner {

    public static String spoonerize(String words) {
        String[] stringSplit = words.split(" ");
        String a = stringSplit[1].substring(0, 1);
        String b = stringSplit[0].substring(0, 1);

        return a + stringSplit[0].substring(1) + " "
                + b + stringSplit[1].substring(1);
    }
}
