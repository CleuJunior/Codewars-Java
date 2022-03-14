package com.br.javawars.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrassHopperTest{

    @Test
    public void test1() { assertEquals(1, GrassHopper.findAverage(new int[]{1})); }
    @Test
    public void test2() { assertEquals(4, GrassHopper.findAverage(new int[]{1,3,5,7})); }

    @Test
    public void test3() { assertEquals(8, GrassHopper.findAverage(new int[]{8,12,1,11})); }

    @Test
    public void test4() { assertEquals(7, GrassHopper.findAverage(new int[]{10,7,8,3})); }

}