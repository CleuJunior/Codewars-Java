package com.br.javawars.kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void negativeNumbersShouldReturnFalse() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, Square.isSquare(-1));

    }

    @Test
    public void zeroShouldReturnTrue() throws Exception {
        assertEquals("0 is a square number (0 * 0)",    true,   Square.isSquare(0));

    }

    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("3 isn't a square number", false,  Square.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   Square.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   Square.isSquare(25));
        assertEquals("26 isn't a square number",false,  Square.isSquare(26));
    }



}