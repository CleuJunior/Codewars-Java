package com.br.javawars.kyu_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookNumTest {

    @Test
    public void testFour() { assertEquals(4, BookNum.pageDigits(4)); }

    @Test
    public void testTwelve() { assertEquals(15, BookNum.pageDigits(12)); }

    @Test
    public void testOneHundred() { assertEquals(192, BookNum.pageDigits(100)); }
}

