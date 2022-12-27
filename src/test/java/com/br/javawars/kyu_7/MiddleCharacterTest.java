package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MiddleCharacterTest {

    @Test
    public void evenTest01() {
        Assertions.assertEquals("es", MiddleCharacter.getMiddle("test"));
    }

    @Test
    public void evenTest02() {
        Assertions.assertEquals("dd", MiddleCharacter.getMiddle("middle"));
    }

    @Test
    public void oddTest01() {
        Assertions.assertEquals("t", MiddleCharacter.getMiddle("testing"));
    }

    @Test
    public void oddTest02() {
        Assertions.assertEquals("A", MiddleCharacter.getMiddle("A"));
    }

}

