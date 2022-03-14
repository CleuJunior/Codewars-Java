package com.br.javawars.kyu_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeonardoOscarTest {

    @Test
    public void oscar88() { assertEquals("Leo finally won the oscar! Leo is happy", LeonardoOscar.leo(88)); }

    @Test
    public void oscar86() { assertEquals("Not even for Wolf of wallstreet?!", LeonardoOscar.leo(86));
    }

    @Test
    public void below88() {
        assertEquals("When will you give Leo an Oscar?", LeonardoOscar.leo(87));
        assertEquals("When will you give Leo an Oscar?", LeonardoOscar.leo(83));
        assertEquals("When will you give Leo an Oscar?", LeonardoOscar.leo(85));
    }

    @Test
    public void over88() {
        assertEquals("Leo got one already!", LeonardoOscar.leo(89));
        assertEquals("Leo got one already!", LeonardoOscar.leo(90));
        assertEquals("Leo got one already!", LeonardoOscar.leo(95));
    }

}