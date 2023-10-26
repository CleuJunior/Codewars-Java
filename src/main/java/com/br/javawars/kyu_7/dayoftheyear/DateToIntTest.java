package com.br.javawars.kyu_7.dayoftheyear;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DateToIntTest {

    @Test
    void exampleTests() {
        assertEquals(145, DateToInt.toDayOfYear(new int[]{25,  5, 2022}), "Normal Day");
        assertEquals(137, DateToInt.toDayOfYear(new int[]{17,  5, 1991}), "Normal day");
        assertEquals(295, DateToInt.toDayOfYear(new int[]{22, 10, 1990}), "Normal day");
        assertEquals(1, DateToInt.toDayOfYear(new int[]{ 1,  1, 2001}), "First day, normal year");
        assertEquals( 1, DateToInt.toDayOfYear(new int[]{ 1,  1, 2000}), "First day, leap year");
        assertEquals(365, DateToInt.toDayOfYear(new int[]{31, 12, 2003}), "Last day, normal year");
        assertEquals(366, DateToInt.toDayOfYear(new int[]{31, 12, 2004}), "Last day, leap year");
        assertEquals(60, DateToInt.toDayOfYear(new int[]{29,  2, 2008}), "Leap day");
    }
}
