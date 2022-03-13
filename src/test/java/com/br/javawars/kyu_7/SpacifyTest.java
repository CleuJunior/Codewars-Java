package com.br.javawars.kyu_7;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SpacifyTest {

    @Test
    public void charactersShouldReturnWithSpaceBetween() {
        assertEquals("h e l l o   w o r l d",Spacify.spacify("hello world"));
        assertEquals("1 2 3 4 5",Spacify.spacify("12345"));
    }

}