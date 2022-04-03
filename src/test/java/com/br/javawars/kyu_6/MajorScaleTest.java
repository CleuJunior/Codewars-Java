package com.br.javawars.kyu_6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorScaleTest {

    private final String test_1 = "CBCACGCFCECDC";
    private final String test_2 = "D#C#BAG#E";
    private final String test_3 = "F#D#A#BC#D#BD#EBG#A#B";
    private final String test_4 = "CD#C#FD#GFG#GA#";

    @Test
    public void basicTests01() { assertEquals("C major scale", MajorScale.majorScale(test_1)); }

    @Test
    public void basicTests02() { assertEquals("No major scale", MajorScale.majorScale(test_2)); }

    @Test
    public void basicTests03() { assertEquals("B major scale", MajorScale.majorScale(test_3)); }

    @Test
    public void basicTests04() { assertEquals("G# major scale", MajorScale.majorScale(test_4)); }
}

