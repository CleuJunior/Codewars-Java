package com.br.javawars.kyu_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {

    @Test
    public void reapetedChars() { assertEquals( 5, Vowels.getCount("abracadabra")); }

    @Test
    public void differentChars() { assertEquals( 2, Vowels.getCount("life")); }

    @Test
    public void emptyStringShouldReturnZero() { assertEquals( 0, Vowels.getCount("")); }

    @Test
    public void phraseTestString() { assertEquals( 4, Vowels.getCount("Code is fun")); }

}