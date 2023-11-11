package com.br.javawars.kyu_8.mergingsortedinteger;

import java.util.Set;
import java.util.TreeSet;

public class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        Set<Integer> setIntegers = new TreeSet<>();

        for (int values: first) {
            setIntegers.add(values);
        }

        for (int values: second) {
            setIntegers.add(values);
        }

        return setIntegers
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
