package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangingLettersTest {

    @Test
    void sampleTest() {
        Assertions.assertEquals("HEllOWOrld!",ChangingLetters.swap("HelloWorld!"));
        Assertions.assertEquals("SUndAy",ChangingLetters.swap("Sunday"));
    }
}

