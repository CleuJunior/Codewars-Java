package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LastSurvivorTest {

    @Test
    void sampleTest01() {
        Assertions.assertEquals("a", LastSurvivor.lastSurvivor("abc",  new int[]{1, 1}),
                String.format("letters: %s coords: %s", "abc", Arrays.toString(new int[]{1, 1})));
    }

    @Test
    void sampleTest02() {
        Assertions.assertEquals("b", LastSurvivor.lastSurvivor("kbc",  new int[]{0, 1}),
                String.format("letters: %s coords: %s", "kbc", Arrays.toString(new int[]{0, 1})));
    }

    @Test
    void sampleTest03() {
        Assertions.assertEquals("z", LastSurvivor.lastSurvivor("zbk",  new int[]{2, 1}),
                String.format("letters: %s coords: %s", "zbk", Arrays.toString(new int[]{2, 1})));
    }

    @Test
    void newEdge() {
        final String str = "foiflxtpicahhkqjswjuyhmypkrdbwnmwbrrvdycqespfvdviucjoyvskltqaqirtjqulprjjoaiagobpftywabqjdmiofpsr";
        final int [] arr = new int[]{
                8, 59, 52, 93, 21, 40, 88, 85, 59, 10, 82, 18, 74, 59, 51, 47, 75, 49, 23, 56, 1, 33, 39, 33, 34, 44,
                25, 0, 51, 25, 36, 32, 57, 10, 57, 12, 51, 55, 24, 55, 31, 49, 6, 15, 10, 48, 27, 29, 38, 30, 35, 42,
                23, 32, 9, 39, 39, 36, 8, 29, 2, 33, 14, 3, 13, 25, 9, 25, 18, 10, 1, 2, 20, 8, 2, 11, 5, 7, 0, 10,
                10, 8, 12, 3, 5, 1, 7, 7, 5, 1, 4, 0, 4, 0, 0, 1
        };

        Assertions.assertEquals("d", LastSurvivor.lastSurvivor(str,  arr),
                String.format("letters: %s coords: %s",  str, Arrays.toString(arr)));
    }

}
