package com.br.javawars.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class BobTest {

    @Test
    public void testBob01() { assertEquals("Should return 0.", 0, Bob.enough(10, 5, 5)); }

    @Test
    public void testBob02() { assertEquals("Should return 10.", 10, Bob.enough(100, 60, 50)); }

    @Test
    public void testBob03() { assertEquals("Should return 0.", 0, Bob.enough(20, 5, 5)); }

}