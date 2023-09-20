package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersInStringsTest {

    @Test
    void basicTests(){
        assertEquals(9, NumbersInStrings.solve("2ti9iei7qhr5"));
        assertEquals(695, NumbersInStrings.solve("gh12cdy695m1"));
        assertEquals(85, NumbersInStrings.solve("lu1j8qbbb85"));
        assertEquals(185, NumbersInStrings.solve("185lu1j8qbbb85"));
    }

}