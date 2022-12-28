package com.br.javawars.kyu_6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WhichAreInTest {

    @Test
    void testInArray() {
        final String[] a = new String[]{ "arp", "live", "strong" };
        final String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        final String[] r = new String[] { "arp", "live", "strong" };

        Assertions.assertArrayEquals(r, WhichAreIn.inArray(a,b));
    }
}

