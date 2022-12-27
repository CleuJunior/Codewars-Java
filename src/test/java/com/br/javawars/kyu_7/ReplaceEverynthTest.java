package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReplaceEverynthTest {

    public static final String VADER_SAID_NO_I_AM_YOUR_FATHER = "Vader said: No, I am your father!";

    @Test
    void basicTests01() {
        final String result = ReplaceEverynth.replaceNth(VADER_SAID_NO_I_AM_YOUR_FATHER, 2, 'a', 'o');
        final String expected = "Vader soid: No, I am your fother!";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void basicTests02() {
        final String result = ReplaceEverynth.replaceNth(VADER_SAID_NO_I_AM_YOUR_FATHER, 4, 'a', 'o');
        final String expected = "Vader said: No, I am your fother!";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void basicTests03() {
        final String result = ReplaceEverynth.replaceNth(VADER_SAID_NO_I_AM_YOUR_FATHER, 6, 'a', 'o');
        final String expected = "Vader said: No, I am your father!";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void basicTests04() {
        final String result = ReplaceEverynth.replaceNth(VADER_SAID_NO_I_AM_YOUR_FATHER, 0, 'a', 'o');
        final String expected = "Vader said: No, I am your father!";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void basicTests05() {
        final String result = ReplaceEverynth.replaceNth(VADER_SAID_NO_I_AM_YOUR_FATHER, -2, 'a', 'o');
        final String expected = "Vader said: No, I am your father!";

        Assertions.assertEquals(expected, result);
    }


    @Test
    void basicTests06() {
        final String result = ReplaceEverynth.replaceNth(VADER_SAID_NO_I_AM_YOUR_FATHER, 1, 'i', 'y');
        final String expected = "Vader sayd: No, I am your father!";

        Assertions.assertEquals(expected, result);
    }

    @Test
    void basicTests07() {
        final String result = ReplaceEverynth.replaceNth("Luke cries: Noooooooooooooooo!", 6, 'o', 'i');
        final String expected = "Luke cries: Noooooioooooioooo!";

        Assertions.assertEquals(expected, result);
    }
}

