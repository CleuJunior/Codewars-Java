package com.br.javawars.kyu_8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReversedStringTest {

    @Test
    public void worldShouldReturndlrow() { assertEquals("dlrow", ReversedString.reverse("world")); }

    @Test
    public void codwarsShouldReturnsrawedoc() { assertEquals("srawedoc", ReversedString.reverse("codewars")); }

    @Test
    public void juniorShouldReturnroinuj() { assertEquals("roinuj", ReversedString.reverse("junior")); }

}