package com.br.javawars.kyu_7.descendingorder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        var numString = Arrays
                .stream(String.valueOf(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());

        return Integer.parseInt(numString);
    }
}
