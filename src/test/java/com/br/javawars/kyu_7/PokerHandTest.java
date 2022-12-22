package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PokerHandTest {

    @Test
    void sampleTest01ShouldReturnTrue() {
        final String[] stringsTest =  {"AS", "3S", "9S", "KS", "4S"};

        Assertions.assertTrue(PokerHand.CheckIfFlush(stringsTest));
    }

    @Test
    void sampleTest02ShouldReturnFalse() {
        final String[] stringsTest =  {"AD", "4S", "7H", "KC", "5S"};

        Assertions.assertFalse(PokerHand.CheckIfFlush(stringsTest));
    }

    @Test
    void sampleTest03ShouldReturnFalse() {
        final String[] stringsTest =  {"AD", "4S", "10H", "KC", "5S"};

        Assertions.assertFalse(PokerHand.CheckIfFlush(stringsTest));
    }


    @Test
    void sampleTest04ShouldReturnTrue() {
        final String[] stringsTest =  {"QD", "4D", "10D", "KD", "5D"};

        Assertions.assertTrue(PokerHand.CheckIfFlush(stringsTest));
    }
}

