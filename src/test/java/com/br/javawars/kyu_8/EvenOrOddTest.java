package com.br.javawars.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {

    @Test
    public void shouldReturnEven() { assertEquals("Even", EvenOrOdd.even_or_odd(6)); }

    @Test
    public void shouldReturnOdd() { assertEquals("Odd", EvenOrOdd.even_or_odd(7)); }

    @Test
    public void zeroShouldReturnEven() { assertEquals("Even", EvenOrOdd.even_or_odd(0)); }

    @Test
    public void negativeEvenShouldReturnEven() { assertEquals("Even", EvenOrOdd.even_or_odd(-2)); }

    @Test
    public void negativeOddShouldReturnOdd() { assertEquals("Odd", EvenOrOdd.even_or_odd(-15)); }

    @Test
    public void primeNumberDifferentOfTwoShouldReturnOdd() { assertEquals("Odd", EvenOrOdd.even_or_odd(-3)); }

}