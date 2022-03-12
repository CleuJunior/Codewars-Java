package com.br.javawars.kyu_8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NthPowerTest {
    @Test
    public void exceedsArrayShouldReturnMinusOne() { assertEquals(-1, NthPower.nthPower(new int[] {1,2}, 2)); }

    @Test
    public void nthPowerThreeShouldReturnEight() { assertEquals(8, NthPower.nthPower(new int[] {3,1,2,2}, 3)); }

    @Test
    public void nthPowerTwoShouldReturnFour() { assertEquals(4, NthPower.nthPower(new int[] {3,1,2}, 2)); }

}