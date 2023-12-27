package com.br.javawars.kyu_7.functionaladdition;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {

    @Test
    public void simpleAdd() {
        assertEquals("Kata.add(3,5)", Solution.add(3).applyAsInt(5), 8);
    }
}
