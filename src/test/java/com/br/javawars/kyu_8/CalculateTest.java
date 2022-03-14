package com.br.javawars.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void shouldReturnUnderweight() { assertEquals("Underweight", Calculate.bmi(62, 1.93)); }

    @Test
    public void shouldReturnNormal() { assertEquals("Normal", Calculate.bmi(80, 1.80)); }


    @Test
    public void shouldReturnOverweight() { assertEquals("Overweight", Calculate.bmi(92, 1.83)); }

    @Test
    public void shouldReturnObese() { assertEquals("Obese", Calculate.bmi(89, 1.63)); }


}