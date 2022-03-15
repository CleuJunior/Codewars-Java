package com.br.javawars.kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class HighestLowestTest {

    @Test
    public void test1() { assertEquals("42 -9", HighestLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")); }

    @Test
    public void test2() { assertEquals("3 1", HighestLowest.highAndLow("1 2 3")); }

    @Test
    public void someTest() { assertEquals("542 -214", HighestLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6")); }

    @Test
    public void sortTest() { assertEquals("10 -20", HighestLowest.highAndLow("10 2 -1 -20"));  }

    @Test
    public void plusMinusTest() { assertEquals("1 -1", HighestLowest.highAndLow("1 -1")); }

    @Test
    public void plusPlusTest() { assertEquals("1 1", HighestLowest.highAndLow("1 1")); }

    @Test
    public void minusMinusTest() { assertEquals("-1 -1", HighestLowest.highAndLow("-1 -1"));  }

    @Test
    public void plusMinusZeroTest() { assertEquals("1 -1", HighestLowest.highAndLow("1 -1 0"));   }

}