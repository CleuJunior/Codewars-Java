package com.br.javawars.kyu_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XORTest {

    private static void testing(boolean actual, boolean expected) { assertEquals(expected, actual);  }

    @Test
    public void falseFalseShouldReturnFalse() { testing(XOR.xor(false, false), false); }

    @Test
    public void trueTrueShouldReturnFalse() { testing(XOR.xor(true, true), false); }

    @Test
    public void falseTrueShouldReturnTrue() { testing(XOR.xor(false, true), true); }

    @Test
    public void trueFalseShouldReturnTrue() { testing(XOR.xor(true, false), true); }

    @Test
    public void testNested() {
        testing(XOR.xor(false, XOR.xor(false, false)), false);
        testing(XOR.xor(XOR.xor(true, false), false), true);
        testing(XOR.xor(XOR.xor(true, true), false), false);
        testing(XOR.xor(true, XOR.xor(true, true)), true);
        testing(XOR.xor(XOR.xor(false, false), XOR.xor(false, false)), false);
        testing(XOR.xor(XOR.xor(false, false), XOR.xor(false, true)), true);
        testing(XOR.xor(XOR.xor(true, false), XOR.xor(false, false)), true);
        testing(XOR.xor(XOR.xor(true, false), XOR.xor(true, false)), false);
        testing(XOR.xor(XOR.xor(true, true), XOR.xor(true, false)), true);
        testing(XOR.xor(XOR.xor(true, XOR.xor(true, true)), XOR.xor(XOR.xor(true, true), false)), true);
    }
}

