package com.br.javawars.kyu_6.oddint;

import java.util.HashMap;
import java.util.Map;

public class FindOddInt {

    protected static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : a) {
            map.compute(number, (key, value) -> (value == null) ? 1 : value + 1);
        }

        int oddKey = 0;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddKey = entry.getKey();
                break;
            }
        }

        return oddKey;
    }

}
