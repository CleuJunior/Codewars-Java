package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierCheckerTest {

    @Test
    void testValid() {
        assertTrue(IdentifierChecker.isValid("i1"));
    }

    @Test
    void testInvalid() {
        assertFalse(IdentifierChecker.isValid("1i"));
    }

}