package com.br.javawars.kyu_7;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmallEnoughTest {

    @Test
    public void basicTests01() { assertTrue(SmallEnough.smallEnough(new int[] { 66, 101 }, 200)); }

    @Test
    public void basicTests02() { assertFalse(SmallEnough.smallEnough(new int[] { 78, 117, 110, 99, 104, 117, 107, 115 }, 100)); }

    @Test
    public void basicTests03() { assertTrue(SmallEnough.smallEnough(new int[] { 101, 45, 75, 105, 99, 107 }, 107)); }

    @Test
    public void basicTests04() { assertTrue(SmallEnough.smallEnough(new int[] { 80, 117, 115, 104, 45, 85, 112, 115 }, 120)); }

}