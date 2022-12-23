package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DotCalculatorTest {

    @Test
    void sampleTestTimes() {
        Assertions.assertEquals("..........", DotCalculator.calc("..... * .."));
    }

    @Test
    void sampleTestDivide() {
        Assertions.assertEquals("..", DotCalculator.calc("..... // .."));
    }

    @Test
    void sampleTestMinus() {
        Assertions.assertEquals("....", DotCalculator.calc("..... - ."));
    }

    @Test
    void sampleTestPlus() {
        Assertions.assertEquals("....................", DotCalculator.calc("..... + ..............."));
    }

    @Test
    void sampleTestTimesTest02() {
        Assertions.assertEquals("...............", DotCalculator.calc("..... * ..."));
    }

    @Test
    void sampleTestMinusTest02() {
        Assertions.assertEquals("..", DotCalculator.calc("..... - ..."));
    }


    @Test
    void sampleTestMinusTest03() {
        Assertions.assertEquals("", DotCalculator.calc(". - ."));
    }

    @Test
    void sampleBlankShouldReturnBlank() {
        Assertions.assertEquals("", DotCalculator.calc(""));
    }

    @Test
    void sampleDivideTest02() {
        Assertions.assertEquals("", DotCalculator.calc(". // .."));
    }
}

