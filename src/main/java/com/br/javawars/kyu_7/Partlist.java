package com.br.javawars.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partlist {
    public static String[][] partlist(String[] arr) {
        List<String[]> parts = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            String[] part = new String[2];
            part[0] = String.join(" ", Arrays.copyOfRange(arr, 0, i));
            part[1] = String.join(" ", Arrays.copyOfRange(arr, i, arr.length));
            parts.add(part);
        }
        return parts.toArray(new String[parts.size()][]);
    }
}
