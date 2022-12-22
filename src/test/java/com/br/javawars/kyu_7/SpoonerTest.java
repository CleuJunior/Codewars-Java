package com.br.javawars.kyu_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpoonerTest {

    @Test
    void simpleTests() {
        Assertions.assertEquals("pit nicking", Spooner.spoonerize("nit picking"));
        Assertions.assertEquals("bedding wells", Spooner.spoonerize("wedding bells"));
        Assertions.assertEquals("belly jeans", Spooner.spoonerize("jelly beans"));
    }
}

