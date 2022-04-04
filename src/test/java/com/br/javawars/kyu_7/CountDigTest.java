package com.br.javawars.kyu_7;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDigTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testExample01() { testing(CountDig.nbDig(10, 1), 4); }

    @Test
    public void testExample02() { testing(CountDig.nbDig(25, 1), 11); }

    @Test
    public void baseTest01() { testing(CountDig.nbDig(5750, 0), 4700); }

    @Test
    public void baseTest02() { testing(CountDig.nbDig(11011, 2), 9481); }

    @Test
    public void baseTest03() { testing(CountDig.nbDig(12224, 8), 7733); }

    @Test
    public void baseTest04() { testing(CountDig.nbDig(11549, 1), 11905); }

}