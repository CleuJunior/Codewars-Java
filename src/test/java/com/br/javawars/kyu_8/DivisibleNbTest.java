package com.br.javawars.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleNbTest {

    @Test
    public void test1() { assertTrue(DivisibleNb.isDivisible(12,4,3)); }

    @Test
    public void test2() { assertFalse(DivisibleNb.isDivisible(3,3,4)); }

    @Test
    public void test3() { assertTrue(DivisibleNb.isDivisible(0,2,1)); }

    @Test
    public void test4() { assertFalse(DivisibleNb.isDivisible(10,8,0)); }

}